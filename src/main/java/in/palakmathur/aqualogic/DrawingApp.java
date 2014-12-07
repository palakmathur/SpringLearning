package in.palakmathur.aqualogic;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String []args) {
        //Triangle triangle = new Triangle();
        //BeanFactory factory =
        // new XmlBeanFactory(new FileSystemResource("src/main/resources/spring-config.xml"));

        AbstractApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-config.xml"); //for this to work spring-config should be in the Classpath and src/main/resources folder is the one
        applicationContext.registerShutdownHook();
        Triangle triangle = (Triangle) applicationContext.getBean
                ("triangle");

        triangle.draw();
    }

}
