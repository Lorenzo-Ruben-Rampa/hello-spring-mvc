package org.lessons.java.spring_intro.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.time.LocalDate;
import java.time.LocalTime;


@Controller
@RequestMapping("/")
public class HomeController {
    //Metodo rotta home
    @GetMapping
    public String home() {
        return "home"; 
    }

    @GetMapping("greetings")
    //Metodo rotta greetings
    public String greetings(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("username", "Skylor");
        model.addAttribute("name", name);
        model.addAttribute("email", "lorenzo.rampa.ruben@hotmail.com");
        model.addAttribute("currentDate", LocalDate.now());
        model.addAttribute("currentTime", LocalTime.now());
        return "greetings"; 
    }
    
    @GetMapping("country")
    //Metodo rotta country
    public String country(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("username", "Skylor");
        model.addAttribute("name", name);
        model.addAttribute("countryName", "Italia");
        model.addAttribute("currentDate", LocalDate.now());
        model.addAttribute("currentTime", LocalTime.now());
        return "country";
    }

}
