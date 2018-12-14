package com.baizhi;

import com.baizhi.entity.Tests;
import com.baizhi.mapper.TestMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTemplateApplicationTests {

    @Autowired
    private TestMapper mapp;
    @Test
    public void contextLoads() {
        Tests test = mapp.selectByPrimaryKey(31);
        System.out.println(test);
    }

    @Test
    public void test1() {

        Example ex =new Example(Tests.class);
        ex.createCriteria().andLessThan("id", 40);
        ex.or().andBetween("id",50,53);
        List<Tests> tests = mapp.selectByExample(ex);
        for (Tests test : tests) {
            System.out.println(test);
        }

    }


}

