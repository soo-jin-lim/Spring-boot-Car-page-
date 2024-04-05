package com.example.car.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @GetMapping({"home","/"})
    public String CarHome(){

        return "home";
    }
    @GetMapping("contact")
    public String CarContact(){

        return "contact";
    }
    @GetMapping("gallery")
    public String CarGallery(){

        return "gallery";
    }
    @GetMapping("single")
    public String CarSingle(){

        return "gallery-single";
    }
    @GetMapping("inner")
    public String Carinner(){

        return "sample-inner-page";
    }
    @GetMapping("about")
    public String CarAbout(){

        return "about";
    }
    @GetMapping("services")
    public String CarService(){

        return "services";
    }
    @GetMapping("carmart")
    public String Carmart(){
        return "carmart";
    }
}
