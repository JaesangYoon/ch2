package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @GetMapping("/register/add")
    public String register() {
        return "registerForm";
    }

    @PostMapping("register/save")
    public String save(User user) {
        return "registerInfo";
    }
}
