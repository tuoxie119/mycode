package com.example.autoconfiguremydb.configure;

import com.example.autoconfiguremydb.mydb.MyDBConnection;
import com.example.autoconfiguremydb.mydb.MyDBTemplate;
import com.example.autoconfiguremydb.properties.MyDBProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liys on 2019/8/31.
 */
@Configuration
@EnableConfigurationProperties(MyDBProperties.class)
public class MyDBConfigure {
    private final MyDBProperties properties;
    public MyDBConfigure(MyDBProperties properties){
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(MyDBConnection.class)
    public MyDBConnection myDBConnection(){
        return new MyDBConnection(this.properties);
    }

    @Bean
    @ConditionalOnMissingBean(MyDBTemplate.class)
    public MyDBTemplate myDBTemplate(MyDBConnection myDBConnection){
        MyDBTemplate myDBTemplate = new MyDBTemplate(myDBConnection);

        return myDBTemplate;
    }

}
