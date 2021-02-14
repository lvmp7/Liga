package br.com.nextevolution.controller.filter;

import br.com.nextevolution.gateway.httpClient.GloboClient;
import br.com.nextevolution.gateway.httpClient.data.response.TokenResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static java.util.Objects.nonNull;

@Log4j2
@RequiredArgsConstructor
//@Component
//@Configuration
public class SecutiryFilter extends UsernamePasswordAuthenticationFilter {
    private final GloboClient globoClient;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String glbToken = request.getHeader("X-GLB-Token");

//        if (isNull(glbToken) || glbToken.isBlank()){
//            String username = obtainUsername(request);
//            String password = obtainPassword(request);
//
//            response.setHeader("X-GLB-Token", getToken(username, password));
//
//            return new UsernamePasswordAuthenticationToken(username,password,new ArrayList<>());
//        }

        return null;
    }

    @Override
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
    }

    private String getToken(String user, String password){
        TokenResponse token = globoClient.authenticar(user, password);
        if (nonNull(token.getGlbId()))
            log.info("Token {}", token.getGlbId());
        return token.getGlbId();
    }
}
