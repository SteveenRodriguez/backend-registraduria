package com.stick.registraduria.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private String id;
    private String nombre;
    private String email;
    private String password;

    private void generatedId() {
        this.id = String.valueOf(UUID.randomUUID());
    }
}
