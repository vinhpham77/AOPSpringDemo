package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        SampleAdd adder = applicationContext.getBean(SampleAdd.class);
        adder.add(1, 2);
    }
}
