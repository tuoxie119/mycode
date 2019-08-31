package com.example.autoconfigureservice01.controller;

import com.example.autoconfiguremydb.mydb.MyDBTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liys on 2019/8/31.
 */
@RestController
@RequestMapping("/mydb")
public class MyController {
    @Autowired
    MyDBTemplate myDBTemplate;
    @RequestMapping("/abc")
    public Object query(){
        return myDBTemplate.execute("select * from user");
    }

}
