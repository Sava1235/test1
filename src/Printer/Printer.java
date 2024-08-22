package Printer;


import Figures.*;

public class Printer {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Figure: "+circle.getFigure()+". Area of circle = "+circle.countArea());
        Quad quad = new Quad(4);
        System.out.println("Figure: "+quad.getFigure()+". Area of quad = "+quad.countArea());
        Trapezium trapezium = new Trapezium(4,5,6);
        System.out.println("Figure: "+trapezium.getFigure()+". Area of trapezium = "+trapezium.countArea());
        Triangle triangle=new Triangle(5);
        System.out.println("Figure: "+triangle.getFigure()+". Area of triangle = "+triangle.countArea());
        Rect rect=new Rect(7,9);
        System.out.println("Figure: "+rect.getFigure()+". Area of rect = "+rect.countArea());
    }
}
