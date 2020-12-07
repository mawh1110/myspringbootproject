package com.mwh.myspringbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/execute")
    public String execute(Map<String,String> map){

        map.put("name","罗晶");

        return "execute";

    }
}
