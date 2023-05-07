package com.stick.registraduria;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;


@SpringBootApplication
@Log
public class RegistraduriaApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(RegistraduriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // variables
        String userMemory = "ss.rodriguez";
        String passwordMemory = "1234";
        String userConsole;
        String passwordConsole;
        String option;
        Boolean flatLogin = true;
        do {
            // inicio de sesión
            log.info("\nBienvenido al servicio de Registraduría\n");
            log.info("Ingrese Usuario");
            userConsole = sc.nextLine();
            log.info("Ingrese Contraseña");
            passwordConsole = sc.nextLine();

            // verificar credenciales
            if (userConsole.matches(userMemory) && passwordConsole.matches(passwordMemory)) {
                log.info("\nBienvenido " + userMemory + "\n\n");
                flatLogin = false;
            } else {
                flatLogin = true;
                log.info("Usuario o contraseña Incorrectos, verifiquelos e ingreselos de nuevo\n\n");
            }
        } while (flatLogin);

        log.info("Menú");
        log.info("1- Registro Civil");
        log.info("2- Tarjeta de Identidad");
        log.info("3- Cédula de ciudadania");
        log.info("4- Otros documentos");
        log.info("5- Cerrar sesión\n\n");
        option = sc.nextLine();

        log.info("Registro Civil de Nacimiento\n\n");
        log.info("1- Ver via Online");
        log.info("2- Descargar");
        option = sc.nextLine();

        if(option.matches("2")) {
            log.info("Descargando .......");
            sc.nextLine();
            log.info("RegistroNacimiento.pdf\n\n\n");
        }

        log.info("\nMenú");
        log.info("1- Registro Civil");
        log.info("2- Tarjeta de Identidad");
        log.info("3- Cédula de ciudadania");
        log.info("4- Otros documentos");
        log.info("5- Cerrar sesión\n\n");
        option = sc.nextLine();

        if(option.matches("5")) {
            log.info("Gracias por preferirnos, vuelva pronto\n");
            SpringApplication.exit(applicationContext, () -> 0);

        }


    }
}
