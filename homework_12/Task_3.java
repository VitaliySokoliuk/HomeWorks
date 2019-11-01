package homework_12;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число 1: ");
        if (sc.hasNextInt()){
            int num1 = sc.nextInt();
            System.out.println("Введи число 2: ");
            if (sc.hasNextInt()){
                int num2 = sc.nextInt();
                System.out.println("Сума чисел: " + (num1 + num2));
            }
            else
                System.out.println("Це не число");
        }
        else
            System.out.println("Це не число");
        
        
    }
}
