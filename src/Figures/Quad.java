package Figures;

public class Quad extends Shape{
    private int side=0;
    private String figureColor = "";
    private String figureEdgingColor = "";
    @Override
    public float countArea() {
        return side*side;
    }

    public Quad(int side) {
        this.side = side;
    }
    public Quad() {

    }

    @Override
    public String getFigureColor() {
        return figureColor;
    }

    @Override
    public void setFigureColor(String figureColor) {
        this.figureColor=figureColor;
    }

    @Override
    public void setFigureEdgingColor(String figureEdgingColor) {
        this.figureEdgingColor=figureEdgingColor;
    }

    @Override
    public String getFigureEdgingColor() {
        return this.getFigureEdgingColor();
    }


    @Override
    public String getFigure() {
        return "Quad";
    }
}
