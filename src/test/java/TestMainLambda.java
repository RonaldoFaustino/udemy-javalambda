import com.udemy.java.lambda.GreetingService;
import com.udemy.java.polymorphism.Dog;

public class TestMainLambda {

    public static void main(String[] args) {
        int a = 5;
        Dog d = new Dog();

        GreetingService g1 = new GreetingService(){
            @Override
            public void greet(String name) {
                System.out.println("Hi... " +  name);
            }
        };

        GreetingService helloService = (name) -> System.out.println("Hello "+ name);
        helloService.greet("Vinoth Leon");


        g1.greet("Vinoth");
    }




}
