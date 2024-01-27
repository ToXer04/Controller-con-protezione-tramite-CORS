package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/names")

public class NameController {
    @GetMapping("/name")
    public String ciao(
            @RequestParam String nome) {
        return "Ciao " + nome;
    }

    @PostMapping("/reversed")
    public String ciaoReversed(
            @RequestBody String nome
    ) {
        StringBuilder reversed = new StringBuilder(nome);
        return "Ciao " + String.valueOf(reversed.reverse());
    }
}
