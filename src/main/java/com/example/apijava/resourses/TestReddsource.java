package com.example.apijava.resourses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestReddsource {

    @GetMapping(value = "/oi")
    public String getOi() {
        return "oi teste";
    }

    @GetMapping(value = "/ola")
    public String getOla() {
        return "oi pessoal";
    }
}

