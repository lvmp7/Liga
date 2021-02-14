package br.com.nextevolution.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@Scope("request")
@RequiredArgsConstructor
public class AuthenticationEndpoint {
    private String username;
    private String password;

    private final AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity authentication(
        @RequestParam("login") String username, @RequestParam("password") String password, HttpServletRequest request){
        this.username = username;
        this.password = password;

        Authentication authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        try {
            Authentication authentication = authenticationManager.authenticate(authenticationToken);
            SecurityContext securityContext = SecurityContextHolder.getContext();

            securityContext.setAuthentication(authentication);

            HttpSession session = request.getSession(true);
            session.setAttribute("SPRING_SECURITY_CONTEXT",securityContext);

            return ResponseEntity.ok().build();
        }catch (AuthenticationException ex){
            return ResponseEntity.status(HttpServletResponse.SC_UNAUTHORIZED).body(ex.getMessage());
        }
    }
}