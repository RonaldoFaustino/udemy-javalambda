import com.udemy.java.lambda.GreetingService;
import com.udemy.java.polymorphism.Dog;

public class TestMainLambda {

    public static void main(String[] args) {
        int a = 5;
        Dog d = new Dog();

       /** GreetingService g1 = new GreetingService(){
            @Override
            public void greet(String name) {
                System.out.println("Hi... " +  name);
            }
        };**/

        GreetingService helloService = (fn,ln,age) -> {
            /**System.out.println("Uppercase Hello :: "+ name.toUpperCase());
            System.out.println("Letters :: " + name.length());**/
            System.out.println("My Name ::" + fn + " " + ln);
            System.out.println("My AGE :: " + age);
        };

        helloService.greet("Vinoth","leon", 50);


        //g1.greet("Vinoth","leon",50);
    }




}
