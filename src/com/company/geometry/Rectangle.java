package com.company.geometry;

public class Rectangle extends Shape {
  private   double width =1.0;
   private   double length = 1.0;
public Rectangle() {

}
public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
}
   double Area = width * length;
   double Perimeter = (width + length) * 2;

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.3,4.7);
        System.out.println(rectangle);
        rectangle = new Rectangle("black",false,7.6,8.5);
        System.out.println(rectangle);
    }
}
