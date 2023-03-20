package br.com.alura.mvc.mudi.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest req) {
        req.setAttribute("nome", "Mundo");

        return "hello";
    }

}
