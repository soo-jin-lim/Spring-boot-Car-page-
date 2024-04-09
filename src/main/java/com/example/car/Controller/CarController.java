package com.example.car.Controller;

import com.example.car.Entity.CarEntity;
import com.example.car.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping({"home","/"})
    public String CarHome(){

        return "home";
    }

    @GetMapping("contact")
    public String CarContact(CarEntity carEntity, Model model) throws Exception{

        return "contact";
    }
    @PostMapping("/carreserve")
    public String boardwritepro(String name, String car, String email, String days) {
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("car: " + car);
        System.out.println("days: " + days);

        return "redirect:/home";
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
    public String Carmart(String category, Model model,
                          @PageableDefault(page = 0, size=10, sort="name", direction = Sort.Direction.DESC) Pageable pageable){
        System.out.println("~~~~~~~~~~~~~~~~~~~"+category);

        Page<CarEntity> list = carService.findByCategory(category, pageable);
        System.out.print(list.getSize());

        int nowPage = list.getPageable().getPageNumber()+1 ;//pageable이 갖고있는 페이지는 0에서 시작하기 때문에 우리가 보는것보다 1느려서 더해줘야함
        int startPage = Math.max(nowPage - 4,1);
        int endPage = Math.min(nowPage + 5, list.getTotalPages());

        model.addAttribute("list",list);
        model.addAttribute("nowPage", nowPage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("category", category);
        model.addAttribute("aa", "aa");


        return "carmart";
    }
}
