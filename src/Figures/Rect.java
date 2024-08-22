package Figures;

public class Rect extends Shape {
    private int width = 0;
    private int heigth = 0;
    private String figureColor = "";
    private String figureEdgingColor = "";

    public Rect(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rect() {

    }


    @Override
    public float countArea() {
        return heigth * width;
    }

    @Override
    public String getFigureColor() {
        return this.figureColor;
    }

    @Override
    public void setFigureColor(String figureColor) {
        this.figureColor = figureEdgingColor;
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
        return "Rect";
    }
}
