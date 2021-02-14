package br.com.nextevolution.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.AbstractAuthenticationToken;

@Setter
@Getter
public class MyToken extends AbstractAuthenticationToken {
    private String token;
    public MyToken(String x_token) {
        super(null);
        this.token = x_token;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
