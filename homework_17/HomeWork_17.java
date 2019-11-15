package homework_17;

import java.util.Scanner;

public class HomeWork_17 {
    
    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1. - додати фракцію");
        System.out.println("\t2. - видалити конкретну фракцію");
        System.out.println("\t3. - вивести усі фракції");
        System.out.println("\t4. - очистити конкретну фракцію");
        System.out.println("\t5. - вивести конкретну фракцію");
        System.out.println("\t6. - додати депутата у фракцію");
        System.out.println("\t7. - видалити депутата з фракції");
        System.out.println("\t8. - вивести список хабарників");
        System.out.println("\t9. - вивести найбільшого хабарника");
        System.out.println("Введи \"quit\" щоб вийти. ");
    }

    public static void main(String[] args) {
        VeRada vr = new VeRada();
        
        Scanner scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    vr.add_faction();
                    break;
                case "2":
                    vr.remove_faction();
                    break;
                case "3":
                    vr.show_all_factions();
                    break;
                case "4":
                    vr.clean_faction();
                    break;
                case "5":
                    vr.show_faction();
                    break;
                case "6":
                    vr.add_deputy_to_faction();
                    break;
                case "7":
                    vr.remove_deputy_from_faction();
                    break;
                case "8":
                    vr.all_grafter_from_faction();
                    break;
                case "9":
                    vr.biggest_grafter_from_faction();
                    break;
            }
            menu();
            line = scan.next();
        }
    }
}
