package com.alejandromax.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.StringReader;
import java.security.Principal;

@Controller
public class HomeController {

    // Muestra el formulario
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // Metodo para manipular la informacion de el formulario
    @GetMapping("/home")
    public String home(Model model, Principal principal){
        model.addAttribute("username", principal.getName());
        return "home";
    }

    // Metodo para redirigir a una misma ruta
    @GetMapping("/")
    public String redirectToHome(){
        return "redirect:/home";
    }
}
