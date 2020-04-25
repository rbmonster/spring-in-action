package com.sia.taco.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * <pre>
 * @Description:
 * TODO
 * </pre>
 *
 * @version v1.0
 * @ClassName: Taco
 * @Author: sanwu
 * @Date: 2020/4/25 20:06
 */
@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class Taco {

    @NotBlank(message = "name is not blank")
    private String name;

    @CreditCardNumber(message = "this is creditNum check")
    private String ccNumber;

    @Pattern(regexp = "^.*", message = "user rex to check")
    private String ccExpiration;

    @Digits(integer = 3, fraction =  0, message = "check to make sure have 3 digits")
    private String ccCVV;

}
