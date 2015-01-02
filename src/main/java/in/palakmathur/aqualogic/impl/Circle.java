package in.palakmathur.aqualogic.impl;

import in.palakmathur.aqualogic.Shape;
import in.palakmathur.aqualogic.events.DrawEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point center;

    @Autowired
    private MessageSource messageSource;


    private ApplicationEventPublisher applicationEventPublisher;

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
        DrawEvent drawEvent = new DrawEvent(this);
        applicationEventPublisher.publishEvent(drawEvent);
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Initializing Circle");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroying Circle");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
