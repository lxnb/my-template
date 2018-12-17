package com.baizhi.controller;

import com.baizhi.entity.Tests;
import com.baizhi.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestMapper mapp;

    @RequestMapping("test")
    public String go(){
        return "index";
    }


    @RequestMapping("queryAll")
    @ResponseBody
    public List<Tests> queryAll(){
        Tests t=new Tests();
        List<Tests> select = mapp.select(t);
        return select;
    }
}
