
package com.azerothai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/hola")
    public String hola() {
        return "¡Azeroth AI está funcionando!";
    }

    @GetMapping("/personaje")
    public String personaje() {
        return """
                {
                    "raza": "Orco",
                    "clase": "Guerrero",
                    "nivel": 80
                }
                """;
    }

    @GetMapping("/saludar")
public String saludar(
        @org.springframework.web.bind.annotation.RequestParam String nombre) {
    return "¡Bienvenido a Azeroth, " + nombre + "!";
}
}