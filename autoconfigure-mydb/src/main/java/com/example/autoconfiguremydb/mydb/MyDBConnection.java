package com.example.autoconfiguremydb.mydb;

import com.example.autoconfiguremydb.properties.MyDBProperties;

/**
 * Created by liys on 2019/8/31.
 */
public class MyDBConnection {
    private final MyDBProperties myDBProperties;

    public MyDBConnection(MyDBProperties myDBProperties) {
        this.myDBProperties = myDBProperties;
    }

    public Object execute(String cmd){
        System.out.println(this.myDBProperties.toString());
        System.out.println(cmd);
        return cmd;
    }
}
