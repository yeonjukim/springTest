package com.yeonju.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yeonju on 2016-06-30.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name","SpringBlog from yeonju");
        return "hello";
    }
}
