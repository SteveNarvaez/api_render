package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // Endpoint principal (Raíz)
    @GetMapping("/")
    public String home() {
        return "¡Hola Profesor! El API Spring Boot de Steven Adair está corriendo perfectamente en Render.";
    }

    // Endpoint secundario para verificar estado
    @GetMapping("/status")
    public String status() {
        return "{\"status\": \"OK\", \"service\": \"ESCOM API\", \"author\": \"Steven\"}";
    }
}
