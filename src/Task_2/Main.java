package Task_2;
import java.util.Scanner;

public class Main {
    
    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1. - Додати учасника клубу");
        System.out.println("\t2. - Додати тваринку до учасника клубу");
        System.out.println("\t3. - Видалити тваринку з учасника клубу");
        System.out.println("\t4. - Видалити учасника з клубу");
        System.out.println("\t5. - Видалити конкретну тваринку зі всіх власників");
        System.out.println("\t6. - Вивести на екран зооклуб");
        System.out.println("\t7. - Вийти з програми");
    }
    
    public static void main(String[] args) {
        Zoo_club zoo = new Zoo_club();
        
        Scanner scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        boolean q = true;
        while (q) {
            switch (line) {
                case "1":
                    zoo.add_member();
                    break;
                case "2":
                    zoo.add_animal_to_person();
                    break;
                case "3":
                    zoo.delete_animal_from_person();
                    break;
                case "4":
                    zoo.delete_person();
                    break;
                case "5":
                    zoo.delete_all_animal();
                    break;
                case "6":
                    zoo.show_zoo_club();
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введіть число від 1 до 7");
                    break;
            }
            menu();
            line = scan.next();
        }
    }
}
