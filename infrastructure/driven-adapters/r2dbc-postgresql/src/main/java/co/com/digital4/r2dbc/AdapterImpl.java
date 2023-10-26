package co.com.digital4.r2dbc;

import co.com.digital4.model.cita.CitaM;
import co.com.digital4.model.cita.gateways.CitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class AdapterImpl implements CitaRepository {
    private MyReactiveRepository myReactiveRepository;
    @Override
    public Mono<CitaM> create(CitaM citaM) {
        return myReactiveRepository.save(Cita.builder()
                .id(citaM.getId())
                .name(citaM.getName())
                .description(citaM.getDescription())
                .duration_minutes(citaM.getDuration_minutes())
                .color_hex_code(citaM.getColor_hex_code())
                .build()).map(m ->
                CitaM.builder()
                        .id(m.getId())
                        .name(m.getName())
                        .description(m.getDescription())
                        .duration_minutes(m.getDuration_minutes())
                        .color_hex_code(m.getColor_hex_code())
                        .build());
    }

    @Override
    public Mono<Void> delete(Integer idCita) {
        return myReactiveRepository.deleteById(idCita);
    }

    @Override
    public Flux<CitaM> getAll() {
        return myReactiveRepository.findAll().map(e ->
                CitaM.builder()
                        .id(e.getId())
                        .name(e.getName())
                        .description(e.getDescription())
                        .duration_minutes(e.getDuration_minutes())
                        .color_hex_code(e.getColor_hex_code())
                        .build());
    }
}
