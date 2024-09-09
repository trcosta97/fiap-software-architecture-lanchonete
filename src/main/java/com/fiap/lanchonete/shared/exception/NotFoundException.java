package com.fiap.lanchonete.shared.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

    private String message;

    public NotFoundException() {
        this.message = "Not found";
    }

    public NotFoundException(String message) {
        this.message = message;
    }

}
