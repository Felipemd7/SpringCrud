package com.myapp.myapp.controller;

import com.myapp.myapp.domain.film.BaseDataFilm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@Controller
@RequestMapping("/film") //url
public class FilmeController {
    @GetMapping
    public String loadPageForm(){ //page path
        return "film/form";
    }

    @PostMapping
    public String filmResgister(BaseDataFilm data){
        System.out.println(data);
        return "film/form";
    }
}
