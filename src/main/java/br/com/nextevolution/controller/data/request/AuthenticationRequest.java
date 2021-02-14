package br.com.nextevolution.controller.data.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthenticationRequest {
    PayloadRequest payload;
}
