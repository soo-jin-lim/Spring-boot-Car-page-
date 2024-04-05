package com.example.car.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @GetMapping({"car/home","/"})
    public String CarHome(){

        return "home";
    }
}
