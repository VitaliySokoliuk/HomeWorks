package Task_2;

import java.util.Random;
import java.util.function.Predicate;

public class Main_2 {

    public static void main(String[] args) {

        Predicate<Boolean> pred = q -> q == true;
        if (pred.test(new Random().nextBoolean())) 
            System.out.println("Решка");
        else 
            System.out.println("Орел");
        

    }
}
