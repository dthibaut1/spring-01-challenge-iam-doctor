package com.wildcodeschool.iamDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{value}")
    @ResponseBody
    public String doctor(@PathVariable String value){
        if (value.equals("1")) {
            return "William Hartnell";
        } else if (value.equals("10")) {
            return "David Tennant";
        } else if (value.equals("13")) {
            return "Jodie Whittaker";
        } else {
            return "URL inconnue";
        }
    }
}
