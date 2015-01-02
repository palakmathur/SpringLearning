package in.palakmathur.aqualogic.impl;

import in.palakmathur.aqualogic.Shape;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn with Center of circle at = " + center);
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
