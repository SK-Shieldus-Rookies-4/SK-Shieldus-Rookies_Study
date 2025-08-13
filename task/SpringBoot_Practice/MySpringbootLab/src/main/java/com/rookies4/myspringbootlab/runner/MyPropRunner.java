package com.rookies4.myspringbootlab.runner;

import com.rookies4.myspringbootlab.property.MyPropProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {

    @Value("${myprop.username}")
    private String username;

    @Value("${myprop.port}")
    private int port;

    private final MyPropProperties myPropProperties;

    public MyPropRunner(MyPropProperties myPropProperties) {
        this.myPropProperties = myPropProperties;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("username = " + myPropProperties.getUsername());
        System.out.println("port = " + myPropProperties.getPort());

    }
}
