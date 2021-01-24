package com.eventoapp.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")        //Quando o usuario chamar vai retornar a pagina index;
    public String index(){
        return "index";
    }
}
