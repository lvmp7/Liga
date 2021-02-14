package br.com.nextevolution.gateway.feign;

import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "cartolaGatewayClient", url = "https://api.cartolafc.globo.com")
public interface CartolaGatewayClient {

    @GetMapping(path = "/ligas")
    List<LigaGatewayResponse> buscaLiga(@RequestParam(name = "q") String nomeLiga, @RequestHeader("host") String host,
                                        @RequestHeader("X-Content-Type-Options") String xContentTypeOptions,
                                        @RequestHeader("X-XSS-Protection") String xssProtection,
                                        @RequestHeader("Access-Control-Allow-Origin") String accessControl
    );

}
