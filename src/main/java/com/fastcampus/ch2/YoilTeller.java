package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class YoilTeller {
    @GetMapping("/getYoil")
    public String main(HttpServletRequest request){
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");



        return "yoil";
    }
}
