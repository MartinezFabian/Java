package polymorphism_using_abstract_classes;

public class Circle extends GeometricFigure {
    private int radius;

    public Circle(int radius) {
        super("Círculo");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
