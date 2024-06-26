package polymorphism_using_abstract_classes;

public class Triangle extends GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triángulo");

        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
