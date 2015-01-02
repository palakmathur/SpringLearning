package in.palakmathur.aqualogic.impl;

import in.palakmathur.aqualogic.Shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Center of circle is = " + center);
    }
}
