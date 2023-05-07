package com.stick.registraduria.services;

import com.stick.registraduria.model.UserModel;
import com.stick.registraduria.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Log
public class UserService {

    @Autowired(required = false)
    private UserModel userModel;

    @Autowired(required = false)
    private UserRepository userRepository;

    public void registerUser() {
        userRepository.findByDocument(1);
    }

    public void getToken() {
        String token = String.valueOf(UUID.randomUUID());
        userModel.getEmail();
        userModel.getId();
        userModel.getNombre();
        userModel.getPassword();
    }

    public void getDocuments() {
        String token = String.valueOf(UUID.randomUUID());
        userModel.getEmail();
        userModel.getId();
        userModel.getNombre();
        userModel.getPassword();
        log.info("Obteniendo documentos");

    }

    public void downloadCopyRegister() {
        userModel.getEmail();
        userModel.getId();
        userModel.getNombre();
        userModel.getPassword();
        log.info("Descargando documentos");
    }
}
