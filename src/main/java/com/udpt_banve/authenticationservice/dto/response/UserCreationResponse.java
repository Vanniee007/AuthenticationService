package com.udpt_banve.authenticationservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class UserCreationResponse {
    private String message;
    public UserCreationResponse(String message) {
        this.message = message;
    }
}
