package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class YoilTellerMVC {

    @GetMapping("/getYoilMVC")
    public String getYoilMVC(String year, String month, String day, Model m) {
        m.addAttribute("year", year);
        m.addAttribute("month", month);
        m.addAttribute("day", day);
//
//        m.addAttribute(year);
//        m.addAttribute(month);
//        m.addAttribute(day);

        return "yoil";
    }
}
