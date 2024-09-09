package com.fiap.lanchonete.shared.validations;

import java.math.BigDecimal;

public class NumberValidator {

    public static boolean isNegative(BigDecimal value){
        return value != null && value.compareTo(BigDecimal.ZERO) < 0;
    }
}
