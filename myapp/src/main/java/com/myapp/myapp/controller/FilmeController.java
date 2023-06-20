package com.myapp.myapp.controller;

import com.myapp.myapp.domain.film.BaseDataFilm;
import com.myapp.myapp.domain.film.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/film") //url
public class FilmeController {

    private List<Film> films = new ArrayList<>();
    @GetMapping("form")
    public String loadPageForm(){ //page path

        return "film/form";
    }
    @GetMapping
    public String loadPageList(){ //page path

        return "film/list";
    }
    @PostMapping
    public String filmResgister(BaseDataFilm data){
        var film = new Film(data);
        films.add(film);
        System.out.println(films);
        return "film/form";
    }
}
