package com.example.BienvenidoSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BienvenidoController {
    @GetMapping("/Bienvenido💸")
    public String bienvenido(@RequestParam(name = "nombre", required = false, defaultValue= "Como invitado🍷")String nombre,
                            Model Model){
        Model.addAttribute( "nombre", "Mateo");
        return "index";
                            }
    
    
}
