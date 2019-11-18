package Task_2;

import java.util.Scanner;

public class HomeWork_18_2 {
    
    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1. - Додати товар");
        System.out.println("\t2. - Видалити товар");
        System.out.println("\t3. - Замінити товар");
        System.out.println("\t4. - Сортувати за назвоню");
        System.out.println("\t5. - Сортувати за вагою");
        System.out.println("\t6. - Сортувати за довжиною");
        System.out.println("\t7. - Сортувати за шириною");
        System.out.println("\t8. - Виводимо і-тий елемент колекції");
        System.out.println("\t9. - Показати колекцію");
        System.out.println("\t10. - Вийти з програми");
    }
    
    public static void main(String[] args) {
        
        Commodity comm = new Commodity();
        
        Scanner scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        boolean q = true;
        while (q) {
            switch (line) {
                case "1":
                    comm.add_commodity();
                    break;
                case "2":
                    comm.remove_commodity();
                    break;
                case "3":
                    comm.replace_commodity();
                    break;
                case "4":
                    comm.sort_by_name();
                    break;
                case "5":
                    comm.sort_by_weight();
                    break;
                case "6":
                    comm.sort_by_lenght();
                    break;
                case "7":
                    comm.sort_by_width();
                    break;
                case "8":
                    comm.sout_i_el();
                    break;
                case "9":
                    comm.show();
                    break;
                case "10":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введіть число від 1 до 10");
                    break;
            }
            menu();
            line = scan.next();
        }
        
    }
    
}
