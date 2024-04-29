package pl.coderslab.oop.constructor;

public class Main {

    public static void main(String[] args) {
//        Burger burger1 = new Burger();
//        Burger burger2 = new Burger(5,5.0);
//
//        System.out.println(burger1.getSize());
//        System.out.println(burger1.getPrice());
//
//        System.out.println();
//        System.out.println(burger2.getSize());
//        System.out.println(burger2.getPrice());

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3, 5));
        System.out.println(calculator.subtract(5, 3));
        System.out.println(calculator.divide(213, 4));
        System.out.println(calculator.multiply(213, 4));
        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Paweł", 30);
        Person person3 = new Person("Kasia", "Nowak", 40, Person.Gender.FEMALE);
    }

}

