package com.mmall.spring.cxf.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mmall.spring.cxf.service.api.ICalculatorService;

public class CalculatorClient {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext-client.xml");
        ICalculatorService service = ctx.getBean("calculatorService", ICalculatorService.class);
        double a = 3.0D;
        double b = 2.0D;
        System.out.println(a + " + " + b + " = " + service.add(a, b));
        System.out.println(a + " - " + b + " = " + service.sub(a, b));
        System.out.println(a + " * " + b + " = " + service.mul(a, b));
        System.out.println(a + " / " + b + " = " + service.div(a, b));
        ctx.close();
    }
}
