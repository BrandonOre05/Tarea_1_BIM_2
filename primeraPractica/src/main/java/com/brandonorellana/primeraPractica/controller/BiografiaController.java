package com.alejandromax.primeraPractica.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String biografia(Model model) {
        model.addAttribute("Nombre", "Brandon");
        model.addAttribute("Edad", 17);

        List<String> cosasquemegustan = Arrays.asList("Me gusta dibujar", "Me gusta el fut", "Mi equipo favorito es el Barcelona", "Me gusta escuchar música", "Mi animal favorito son los perritos");
        model.addAttribute("CosasQueMegustan", cosasquemegustan);

        return "biografia";
    }
}
