package sec13.ch05;

public class RegularPolygon {

    private int sides;

    public RegularPolygon(int sides) {
        this.sides = sides;
    }

    public double getInnerAngle () {
        return (sides % 2) * 180 / sides;
    }

    public int getPerimeter (int sideLength) {
        return sideLength * sides;
    }
}
