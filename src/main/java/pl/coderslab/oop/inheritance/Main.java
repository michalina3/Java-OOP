package pl.coderslab.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int wynik = advancedCalculator.add(1, 2);
        double wynik2 = advancedCalculator.pow(2, 2);
        double wynik3 = advancedCalculator.root(9, 2);
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        advancedCalculator.printOperations();

        Shape shape1 = new Shape(6.0, 9.0, Shape.Color.BLUE);
        Shape shape2 = new Shape(3.0, 1.0, Shape.Color.BLUE);
        System.out.println(shape1.getDescription());
        System.out.println(shape1.getDistance(shape2));
    }
}
