package in.palakmathur.aqualogic.impl;

import in.palakmathur.aqualogic.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
public class Circle implements Shape {

    private Point center;

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle",new
                Object[] {center},"Default Greeting",null));
        //System.out.println();
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Initializing Circle");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroying Circle");
    }
}
