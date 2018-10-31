package ru.unn.agile.threeDimShapesArea.Model;


public class Cone implements Shape {
    private Circle base;
    private double height;

    public Cone(final double radius, final double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(ShapesAreaConstants.ILLEGAL_ARGUMENTS_EXCEPTION_STR);
        }
        base = new Circle(radius);
        this.height = height;
    }


    @Override
    public double getArea() {
        return base.getArea() + Math.PI * height * base.getRadius();
    }
}
