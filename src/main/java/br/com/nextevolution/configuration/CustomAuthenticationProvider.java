package br.com.nextevolution.configuration;

import br.com.nextevolution.gateway.httpClient.data.response.TokenResponse;
import br.com.nextevolution.gateway.httpClient.impl.GloboClientImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static java.util.Objects.nonNull;

@Component
@RequiredArgsConstructor
@Log4j2
public class CustomAuthenticationProvider implements AuthenticationProvider {
    private final GloboClientImpl globoClient;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        TokenResponse token = autenticar(name, password);

        if (nonNull(token)){
            return new UsernamePasswordAuthenticationToken(token.getGlbId(),password,new ArrayList<>());
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private TokenResponse autenticar(String user, String password){
        TokenResponse token = globoClient.authenticar(user, password);
        if (nonNull(token.getGlbId()))
            log.info("Token {}", token.getGlbId());
        return token;
    }
}