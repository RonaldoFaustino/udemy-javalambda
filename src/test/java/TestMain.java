import com.udemy.java.polymorphism.*;

public class TestMain {

    public static void main(String[] args) {

        AreaCalculator a = new AreaCalculator();

        System.out.println(a.getArea(5));
        System.out.println(a.getArea(5.25));
        System.out.println(a.getArea(5, 4));

        System.out.println("--------------- Cavalo");
        Animal d = new Horse();
        test(d);
        System.out.println("--------------- Cat");
        d = new Cat();
        test(d);
        System.out.println("--------------- DOg");
        d = new Dog();
        test(d);

    }

    private static void test(Animal d){
        d.makeSound();
        d.walk();
    }

}
