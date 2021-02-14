package br.com.nextevolution.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Cartoleiro {
    private String email;
    private String pass;
}
