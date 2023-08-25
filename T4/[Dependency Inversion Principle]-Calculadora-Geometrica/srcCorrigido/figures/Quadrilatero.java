package T4.srcCorrigido.figures;

import T4.srcCorrigido.interfaces.Ishape;

public class Quadrilatero implements Ishape {
    private double x, y;

    public Quadrilatero(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Double getArea() {
        return x*y;
    }

    @Override
    public Double getPerimetro() {
        return 2*x+2*y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
}
