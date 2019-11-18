package Task_1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork_18 {

    public static void main(String[] args) {
        
        Set<Cars> cars = new HashSet<>();
        
        cars.add(new Cars("MAZDA", 650000));
        cars.add(new Cars("BMW", 850000));
        cars.add(new Cars("Mersedes", 1100000));
        cars.add(new Cars("KIA", 500000));
        cars.add(new Cars("BMW", 650000));
        cars.add(new Cars("VOLVO", 420000));
        cars.add(new Cars("TOYOTA", 690000));
        cars.add(new Cars("MAN", 1580000));
        cars.add(new Cars("MAZDA", 530000));
        
        System.out.println("Невідсортований HashSet:");
        for (Cars car : cars){
            System.out.println(car);
        }
        
        Set<Cars> car = new TreeSet<>();
        
        for (Cars c : cars){
            car.add(c);
        }
        
        System.out.println("\nВідсортований за спаданням TreeSet:");
        for (Cars ca : car){
            System.out.println(ca);
        }
        
        
        Set<Cars> car_s = new TreeSet<>(new PriceCarsComporator());
        
        for (Cars c : cars){
            car_s.add(c);
        }
        
        System.out.println("\nВідсортований за зростанням TreeSet:");
        for (Cars ca : car_s){
            System.out.println(ca);
        }
        
        
    }
    
}
