package polymorphism_using_abstract_classes;

public abstract class GeometricFigure {
    private String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public static double calculateAverageArea (GeometricFigure[] figures) {
        double sum = 0;

        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].calculateArea(); // POLIMORFISMO
        }

        return sum / figures.length;
    }

    @Override
    public String toString() {
        return name + " area: " + calculateArea();
    }
}
