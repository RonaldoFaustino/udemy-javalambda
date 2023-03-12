import com.udemy.java.polymorphism.Animal;
import com.udemy.java.polymorphism.Cat;
import com.udemy.java.polymorphism.Dog;
import com.udemy.java.polymorphism.Horse;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

        List<Animal> l = new ArrayList();
        l.add(dog);
        l.add(cat);
        l.add(horse);

        findMaxAge(l);
    }

    private static void findMaxAge(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
