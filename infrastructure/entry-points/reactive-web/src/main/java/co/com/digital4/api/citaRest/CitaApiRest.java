package co.com.digital4.api.citaRest;

import co.com.digital4.model.cita.CitaM;
import co.com.digital4.usecase.cita.CitaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CitaApiRest {
    private final CitaUseCase citaUseCase;

    @PostMapping(path ="/create")
    public Mono<CitaM> create(@RequestBody CitaM citaMModel) {
        return this.citaUseCase.create(citaMModel);
    }

    @DeleteMapping("delete/{id}")
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return this.citaUseCase.delete(id);
    }

    @GetMapping(path = "/getAll")
    public Flux<CitaM> commandName() {
        return citaUseCase.getAll();
    }
}
