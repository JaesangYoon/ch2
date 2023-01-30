package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class YoilTellerMVC2 {

    @GetMapping("/getYoilMVC2")
    public String getYoilMVC(MyDate myDate, Model m) {



        return "yoil";
    }
}
