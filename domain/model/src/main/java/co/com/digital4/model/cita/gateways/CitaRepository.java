package co.com.digital4.model.cita.gateways;

import co.com.digital4.model.cita.CitaM;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CitaRepository {
    Mono<CitaM> create(CitaM citaM);

    Mono<Void> delete(Integer idCita);

    Flux<CitaM> getAll();
}
