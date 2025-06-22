package com.lca2.k8s_api_gateway.advice.parameter;

import lombok.Builder;
import lombok.Data;

@Data
public class FieldErrorMessage {
    private String field;
    private String message;

    @Builder
    public FieldErrorMessage(String field, String message) {
        this.field = field;
        this.message = message;
    }
}
