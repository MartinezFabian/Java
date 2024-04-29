package polymorphism_using_abstract_classes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(3, 6);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

        GeometricFigure[] figures = { circle, rectangle, triangle };

        System.out.println( "Promedio: " +  GeometricFigure.calculateAverageArea(figures));
    }
}
