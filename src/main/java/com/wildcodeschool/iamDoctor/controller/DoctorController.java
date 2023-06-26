package com.wildcodeschool.iamDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String doctor(@PathVariable String id){
        if (id.equals("1")) {
            return "William Hartnell";
        } else if (id.equals("10")) {
            return "David Tennant";
        } else if (id.equals("13")) {
            return "Jodie Whittaker";
        } else {
            return "Unknown Doctor";
        }
    }
}
