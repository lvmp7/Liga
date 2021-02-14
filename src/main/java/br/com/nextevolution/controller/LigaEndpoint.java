package br.com.nextevolution.controller;

import br.com.nextevolution.UseCase.BuscarLigas;
import br.com.nextevolution.UseCase.LigaDoUsuario;
import br.com.nextevolution.controller.conveter.LigaResponseConverter;
import br.com.nextevolution.controller.data.response.LigaResponse;
import br.com.nextevolution.entity.Liga;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

import static java.util.Objects.isNull;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ligas")
public class LigaEndpoint {
    private final LigaResponseConverter ligaResponseConverter;
    private final BuscarLigas buscarLigas;
    private final LigaDoUsuario ligaDoUsuario;

    @GetMapping("/{slugLiga}")
    public ResponseEntity<List<LigaResponse>> buscarLigas(@PathVariable String slugLiga){
        return ResponseEntity.ok(
                ligaResponseConverter.convertToResponse(buscarLigas.executar(slugLiga))
        );
    }

    @GetMapping("/minhaLiga")
    public ResponseEntity minhaLiga(Principal principal){
        List<Liga> ligas = ligaDoUsuario.executar(principal.getName());
        if (isNull(ligas) || ligas.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ligas);
    }
}
