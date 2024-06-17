package com.udpt_banve.authenticationservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class UserCreationRequest {
    @NotEmpty
    @Size(min = 4, message = "INVALID_USERNAME")
    String username;

    @NotEmpty
    @Size(min = 6, message = "INVALID_PASSWORD")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

}
