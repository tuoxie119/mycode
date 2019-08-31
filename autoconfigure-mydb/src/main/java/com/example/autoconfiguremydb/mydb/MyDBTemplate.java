package com.example.autoconfiguremydb.mydb;

/**
 * Created by liys on 2019/8/31.
 */
public class MyDBTemplate {

    private final MyDBConnection myDBConnection;
    public MyDBTemplate(MyDBConnection myDBConnection){
        this.myDBConnection = myDBConnection;
    }

    public Object execute(String cmd){
        return this.myDBConnection.execute(cmd);
    }
}
