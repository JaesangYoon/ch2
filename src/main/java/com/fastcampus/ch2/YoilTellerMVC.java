package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YoilTellerMVC {

    @GetMapping("/getYoilMVC")
    public String getYoilMVC(int year, int month, int day, Model m) {
        m.addAttribute("year", year);
        m.addAttribute("month", month);
        m.addAttribute("day", day);

//        m.addAttribute(year);
//        m.addAttribute(month);
//        m.addAttribute(day);

        return "yoil";
    }
}
