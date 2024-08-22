package Figures;

public class Triangle extends Shape {

    private float sideLength = 0;
    private String figureColor = "";
    private String figureEdgingColor = "";

    public Triangle() {

    }

    public Triangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float countArea() {
        return (float) (Math.sqrt(3) / 4 * Math.pow(sideLength, 2));
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
        return "Triangle";
    }
}
