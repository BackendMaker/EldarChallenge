package com.example.EldarChallenge.Dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Request {
    @NotNull(message = "El campo cardBand no puede ser nulo")
    private String cardBrand;
    @NotNull(message = "El campo amount no puede ser nulo")
    private Double amount;

}
