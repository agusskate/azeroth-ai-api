
package com.azerothai;

import com.azerothai.model.Personaje;
import com.azerothai.service.JsonService;
import com.azerothai.service.LlmService;
import com.azerothai.service.PromptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {

    private final PromptService promptService = new PromptService();
    private final LlmService llmService = new LlmService();
    private final JsonService jsonService = new JsonService();

    @PostMapping("/personajes")
    public Personaje crearPersonaje(@RequestBody PersonajeRequest peticion)
            throws Exception {

        String prompt = promptService.construirPrompt(
                peticion.raza(),
                peticion.clase(),
                peticion.personalidad()
        );

        String respuestaIA = llmService.generarRespuesta(prompt);

        return jsonService.convertirDesdeJson(respuestaIA);
    }
}
