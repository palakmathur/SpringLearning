package in.palakmathur.aqualogic.impl;


import in.palakmathur.aqualogic.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //BeanFactory factory =
        // new XmlBeanFactory(new FileSystemResource("src/main/resources/spring-config.xml"));

        //AbstractApplicationContext applicationContext = new
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-config.xml"); //for this to work spring-config should be in the Classpath and src/main/resources folder is the one
        // applicationContext.registerShutdownHook();

        Shape shape;
        shape = (Shape) applicationContext.getBean("circle");
        shape.draw();
    }

}
