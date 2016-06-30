package com.yeonju.blog.controller;


import com.yeonju.blog.model.Hello;
import com.yeonju.blog.repository.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yeonju on 2016-06-30.
 */
@RestController
public class HelloRestController {
    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(Hello hello) {

        Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model) {

        List<Hello> helloList = helloDao.findAll();

        return helloList;
    }
    @RequestMapping("/")
    public String index() {
        return "helloworld!";
    }
}
