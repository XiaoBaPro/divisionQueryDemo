package com.example.divisionquerydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wang
 */
@Controller
public class IndexController {

    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    
}
