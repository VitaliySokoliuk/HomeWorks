package homework_15;

import java.util.Arrays;
import java.util.Collections;

public class HomeWork_15 {

    public static void main(String[] args) {
        
        Integer[] mass = new Integer[10];
        for(int i = 0; i < mass.length; i++){
            mass[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass, Collections.reverseOrder());
        System.out.println(Arrays.toString(mass));
    }

}
