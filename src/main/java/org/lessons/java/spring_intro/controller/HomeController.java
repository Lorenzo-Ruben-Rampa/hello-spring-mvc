package org.lessons.java.spring_intro.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    //Metodo home
    @GetMapping
    public String home() {
        return "home"; // corrisponde a src/main/resources/templates/home.html
    }
    
}
