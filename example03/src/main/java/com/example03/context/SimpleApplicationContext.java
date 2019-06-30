package com.example03.context;


import com.example03.service.OrderService;
import com.example03.service.OrderServiceImpl;
import com.example03.util.BaseSequenceGenerator;
import com.example03.util.DateSequenceGenerator;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages={"com.example03"})
public class SimpleApplicationContext {

    SimpleApplicationContext(){

        System.out.println("1) "+this.toString());
    }

    @Bean
   // @Primary
    public BaseSequenceGenerator getSequenceGenerator(){
/*        SequenceGenerator generator = new SequenceGenerator();
        generator.setPrefix("Java");
        generator.setSuffix("Bitcamp");
        generator.setInitial(10000);
        return generator;*/
        DateSequenceGenerator generator = new DateSequenceGenerator();
        System.out.println("2-3) dateSequenceGenerator : "+generator.toString());
        generator.setFormat("yyyyMMdd");
        generator.setInitial(10000);
        return generator;

    }

    @Bean
    public OrderService getOrderService(){

        //Method 1: by constructor
        return new OrderServiceImpl();


        //Method 2: by setter
        /*OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.setSequenceGenerator(getSequenceGenerator());
        return orderService;

     return new OrderServiceImpl();*/
}
}
