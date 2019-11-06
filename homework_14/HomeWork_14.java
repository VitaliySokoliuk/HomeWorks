package homework_14;

import java.util.Scanner;

public class HomeWork_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.length() == 5) {
            if (str.toUpperCase().charAt(0) == str.toUpperCase().charAt(4)
                    && str.toUpperCase().charAt(1) == str.toUpperCase().charAt(3)) {
                System.out.println("Слово паліндром");
            } else {
                System.out.println("Слово не паліндром");
            }
        } else {
            System.out.println("Слово не з 5 букв");
        }
        
    }

}
