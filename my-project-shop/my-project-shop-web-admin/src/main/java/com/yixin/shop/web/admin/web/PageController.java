package com.yixin.shop.web.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
    public String doPage(){
        return "main";
    }
}
