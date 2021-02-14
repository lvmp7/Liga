package br.com.nextevolution.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Component
public class HttpClientConfiguration {

    @Bean
    public WebTarget javaxClient(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        return target;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
