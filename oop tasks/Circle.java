package task2;
public class Circle {
    double radious =1;
    String color = "red";

    //setters and getters
    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //constructors
     public Circle() {
         
    }
    public Circle(double radious ){
        this.radious=radious;
    }
    
    public Circle(double radious , String color){
        this.radious=radious;
        this.color=color;
    }
    //get area
    public double getArea(){
        double area = (22/7)*radious;
        return area;
    }
    //to string

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + ", color=" + color + '}';
    }
    
}
