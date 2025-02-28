package eci.arep.crud.CrudSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Endpoints básicos
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World!";
    }

    // Endpoint con parámetros en la URL
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
