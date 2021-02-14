package br.com.nextevolution.controller.data.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PayloadRequest {
    private String email;
    private String password;
    private int serviceId;
}
