package in.palakmathur.aqualogic.impl;


import in.palakmathur.aqualogic.Shape;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class DrawingApp {

    public static void main(String[] args) {

        //AbstractApplicationContext applicationContext = new
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-config.xml"); //for this to work spring-config should be in the Classpath and src/main/resources folder is the one
        //applicationContext.registerShutdownHook();


        Shape shape;
        shape = (Shape) applicationContext.getBean("circle");
        shape.draw();

       // System.out.println(applicationContext.getMessage("greeting",null,
           //     "Default Greeting", null ));
    }

}
