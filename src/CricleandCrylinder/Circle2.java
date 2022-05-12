package CricleandCrylinder;

public class Circle2 {
    double radius = 4.0;
    private String color;

    public Circle2(){

    }

    public Circle2(double radius, String color, double pi) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        System.out.println(circle2.getArea());
    }
}
