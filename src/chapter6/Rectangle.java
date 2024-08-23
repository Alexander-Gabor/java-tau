package chapter6;

public class Rectangle {

    private double length;
    // if it was protected instead of private it means other classes within the same package can access it.
    // Similar to having no access modified at all.
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way
    }

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
       this.width = width;
    }

    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    double calculateArea(){
        return length * width;
    }
}
