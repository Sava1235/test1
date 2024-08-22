package Figures;

public class Circle extends Shape {
    private static final float PI = 3.14f;
    private String figureColor = "";
    private float radius;
    private String figureEdgingColor = "";

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return 2 * PI * getRadius() * getRadius();
    }

    @Override
    public String getFigureColor() {
        return figureColor;
    }

    @Override
    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public void setFigureEdgingColor(String figureEdgingColor) {
        this.figureEdgingColor = figureEdgingColor;
    }

    @Override
    public String getFigureEdgingColor() {
        return figureEdgingColor;
    }

    @Override
    public String getFigure() {
        return "Circle";
    }

}
