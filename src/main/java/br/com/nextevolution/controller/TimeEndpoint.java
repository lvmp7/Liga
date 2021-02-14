package br.com.nextevolution.controller;

import br.com.nextevolution.entity.Time;
import br.com.nextevolution.gateway.CartolaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@RestController
@RequiredArgsConstructor
@RequestMapping("/time")
public class TimeEndpoint {
    private final CartolaGateway cartolaGateway;

    @GetMapping("/nome/{nome}")
    public ResponseEntity buscaTime(@PathVariable String nome){

        Time time = cartolaGateway.buscaTime(nome);
        if (isNull(time))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(time);
    }
}
