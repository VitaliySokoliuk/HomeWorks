package homework_12;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число: ");
        
        if (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("Ти ввів число: " + num);
        }
        else
            System.out.println("Це не число");
    
    
    }
}
