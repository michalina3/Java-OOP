package pl.coderslab.oop.inheritance;

public class Shape {
    private double x;
    private double y;
    private Color color;

    public Shape(double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public String getDescription(){
        return String.format("Parametr x: %.2f parametr y: %.2f color %s", x, y, color);
    }

    public double getDistance(Shape shape){
        double deltaX = this.x - shape.x;
        double deltaY = this.y - shape.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    enum Color{
        GREEN,
        RED,
        BLUE
    }
}
