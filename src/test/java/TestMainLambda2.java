import com.udemy.java.lambda.GreetingService;
import com.udemy.java.polymorphism.Dog;

import javax.sound.midi.Soundbank;

public class TestMainLambda2 {

    public static void main(String[] args) {
        GreetingService greetingService = (fistName, lastName, age) ->
                System.out.println(fistName);

    }

}
