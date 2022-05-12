package com.company.geometry;


public class Circle extends Shape{
private  double radius = 1.0;
    public Circle(){

    }
double Perimeter = 2 * radius * Math.PI;
double Area = radius * radius * Math.PI;

public Circle(double radius){
    this.radius = radius;
}
    public Circle(double radius ,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
      Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(4.5,"siyan",false);
        System.out.println(circle);
    }
}
