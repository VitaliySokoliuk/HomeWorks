/**
 * Copyright add 13 home work
 */

package homework_12;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author UA
 * @version 0.1
 * @since JDK 1.8
 */

public class HomeWork_12 {

    // змінна для вводу даних з консолі
    static Scanner scan;

    /**
     * викликає меню
     *
     * @param немає
     * @return нічого
     * @author Vitaliy
     * @see - дививсь заголовок
     */
    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1.Перевірити чи є такий місяць. ");
        System.out.println("\t2.Вивести місяці з такою ж порою року. ");
        System.out.println("\t3.Вивести місяці, які мають таку саму кількість днів. ");
        System.out.println("\t4.Вивести місяці, які мають меншу кільксть днів. ");
        System.out.println("\t5.Вивести місяці, які мають більшу кільксть днів. ");
        System.out.println("\t6.Вивести наступну пору року. ");
        System.out.println("\t7.Вивести попередню пору року. ");
        System.out.println("\t8.Вивести місяці, які мають парну кількість днів. ");
        System.out.println("\t9.Вивести місяці, які мають непарну кількість днів. ");
        System.out.println("\t10.Вивести, чи введений місяць має парну кількість  днів. ");
        System.out.println("Введи \"quit\" щоб вийти. ");
    }

    /**
     * @param немає
     * @return нічого
     * @throws WrongInputConsoleParametersException - коли місяць не існує
     * @author Vitaliy
     * @see - дививсь заголовок
     */
    private static void task_1() {
        try {
            
            // Використовуючи ArrayList зробить тільки одне завдання, тому що воно однотипне
            
            ArrayList <String> month = new ArrayList<>();
            boolean isFinded = false;
            System.out.println("Введи місяць: ");
            String str = scan.next();
            for (Month mon : Month.values()) {
                month.add(mon.toString());
            }
            
            for(int i = 0; i < month.size(); i++){
                if (month.contains(str)) {
                    System.out.println("Місяць існує");
                    isFinded = true;
                    break;
                }
            }
            if (!isFinded) {
                throw new WrongInputConsoleParametersException("Місяць не існує");
            }
        } catch (WrongInputConsoleParametersException e) {
            System.out.println(e);
        }
    }

    /**
     * @param немає
     * @return нічого
     * @throws WrongInputConsoleParametersException - коли місяць не знайдено
     * @author Vitaliy
     * @see - дививсь заголовок
     */
    private static void task_2() {
        try {
            boolean isFinded = false;
            System.out.println("Введи пору року: ");
            String str = scan.next();
            for (Month mon : Month.values()) {
                if (mon.getSeason().name().equalsIgnoreCase(str)) {
                    System.out.println(mon.name());
                    isFinded = true;
                }
            }
            if (!isFinded) {
                throw new WrongInputConsoleParametersException("Місяців не знайдено");
            }
        } catch (WrongInputConsoleParametersException e) {
            System.out.println(e);
        }
    }

    private static void task_3() {
        boolean isFinded = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scan.nextInt();
        for (Month mon : Month.values()) {
            if (mon.getDays() == day) {
                System.out.println(mon.name());
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void task_4() {
        boolean isFinded = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scan.nextInt();
        for (Month mon : Month.values()) {
            if (mon.getDays() < day) {
                System.out.println(mon.name());
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void task_5() {
        boolean isFinded = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scan.nextInt();
        for (Month mon : Month.values()) {
            if (mon.getDays() > day) {
                System.out.println(mon.name());
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void task_6() {
        boolean isFinded = false;
        System.out.println("Введи пору року: ");
        String str = scan.next();
        for (Season s : Season.values()) {
            if (s.name().equalsIgnoreCase(str)) {
                if (s.ordinal() == 3) {
                    System.out.println("Наступна пора року: " + Season.values()[0]);
                } else {
                    System.out.println("Наступна пора року: " + Season.values()[s.ordinal() + 1]);
                }
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Пору року не знайдено");
        }
    }

    private static void task_7() {
        boolean isFinded = false;
        System.out.println("Введи пору року: ");
        String str = scan.next();
        for (Season s : Season.values()) {
            if (s.name().equalsIgnoreCase(str)) {
                if (s.ordinal() == 0) {
                    System.out.println("Попередня пора року: " + Season.values()[3]);
                } else {
                    System.out.println("Попередня пора року: " + Season.values()[s.ordinal() - 1]);
                }
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Пору року не знайдено");
        }
    }

    private static void task_8() {
        boolean isFinded = false;
        System.out.println("Місяці з парною кількістю днів: ");
        for (Month mon : Month.values()) {
            if (mon.getDays() % 2 == 0) {
                System.out.println(mon.name());
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void task_9() {
        boolean isFinded = false;
        System.out.println("Місяці з непарною кількістю днів: ");
        for (Month mon : Month.values()) {
            if (mon.getDays() % 2 == 1) {
                System.out.println(mon.name());
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void task_10() {
        boolean isFinded = false;
        System.out.println("Введи місяць: ");
        String str = scan.next();
        for (Month mon : Month.values()) {
            if (mon.name().equalsIgnoreCase(str)) {
                if (mon.getDays() % 2 == 0) {
                    System.out.println("Місяць з парною кількість днів");
                    isFinded = true;
                } else if (mon.getDays() % 2 == 1) {
                    System.out.println("Місяць з непарною кількість днів");
                    isFinded = true;
                }
            }
        }
        if (!isFinded) {
            System.out.println("Місяць не знайдено");
        }
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    task_1();
                    break;
                case "2":
                    task_2();
                    break;
                case "3":
                    task_3();
                    break;
                case "4":
                    task_4();
                    break;
                case "5":
                    task_5();
                    break;
                case "6":
                    task_6();
                    break;
                case "7":
                    task_7();
                    break;
                case "8":
                    task_8();
                    break;
                case "9":
                    task_9();
                    break;
                case "10":
                    task_10();
                    break;
            }
            menu();
            line = scan.next();
        }
    }
}
