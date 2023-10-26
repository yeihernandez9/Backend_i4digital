package co.com.digital4.usecase.cita;

import co.com.digital4.model.cita.CitaM;
import co.com.digital4.model.cita.gateways.CitaRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CitaUseCase {
    private CitaRepository citaRepository;
    public Mono<CitaM> create(CitaM citaM) {
        return citaRepository.create(citaM);
    }

    public Mono<Void> delete(Integer idCita){
        return citaRepository.delete(idCita);
    }

    public Flux<CitaM> getAll() {
        return citaRepository.getAll();
    }
}
