package in.palakmathur.aqualogic.impl;

import in.palakmathur.aqualogic.Shape;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements Shape {
        //InitializingBean, DisposableBean {
//implements
// ApplicationContextAware,
// BeanNameAware{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext applicationContext = null;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {

        //  System.out.println(getType + " Triangle is drawn with height " +
        // getHeight);

        System.out.println("Points are:");
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
        System.out.println("pointC = " + pointC);
    }


/*    public void myInit(){
        System.out.println("MyInit called for triangle");
    }

    public void cleanUp(){
        System.out.println("Destroying beans");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Property Set");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying");

    }*/
   /* @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;


    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is: " + beanName);

    }
*/
/*    private String type;

    private int height;


    public Triangle(String type){
        this.type = type;
    }

    public Triangle(int height){
        this.height = height;
    }

    public Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }



    */

    /*-private List<Point> pointList;

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }*/


}
