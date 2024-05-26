public class Main {
    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10d;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType() + ":");
            System.out.println("  Perimeter: " + figure.getPerimeter());
            System.out.println("  Area: " + figure.getArea());
            System.out.println();
        }
    }
}
