package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");

        //getting the bean from the spring continer through the xml config file
        laptop lap= (laptop) context.getBean("lap");
        lap.start();

        coding code=(coding) context.getBean("code");
        code.code();


    }
}