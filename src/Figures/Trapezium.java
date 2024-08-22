package Figures;

public class Trapezium extends Shape {
    private int firstSide = 0;
    private int secondSide = 0;
    private int height = 0;
    private String figureColor = "";
    private String figureEdgingColor = "";

    public Trapezium(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Trapezium(int firstSide, int secondSide, int height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public Trapezium() {

    }

    @Override
    public float countArea() {
        return ((this.firstSide + this.secondSide) * this.height) / 2;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getFigureColor() {
        return this.figureColor;
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
        return this.figureEdgingColor;
    }

    @Override
    public String getFigure() {
        return "Trapezium";
    }
}
