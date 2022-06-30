import com.udemy.java.interfacepolymorphism.Alarm;
import com.udemy.java.interfacepolymorphism.Clock;
import com.udemy.java.interfacepolymorphism.GoogleMini;
import com.udemy.java.interfacepolymorphism.Iphone;
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

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");


        GoogleMini g = new GoogleMini();
        Iphone i = new Iphone();
        Clock c = new Clock();
        alarmTest(i);
        alarmTest(c);
        alarmTest(g);

    }

    private static void test(Animal d){
        d.makeSound();
        d.walk();
        d.eat();
    }

    private static void alarmTest(Alarm a){
        a.setAlarm();
        a.triggeralarm();
    }
}
