package homework_12;

import java.util.Scanner;

public class HomeWork_12 {

    static Scanner scan;

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

    private static void task_1() {
        boolean isFinded = false;
        System.out.println("Введи місяць: ");
        String str = scan.next();
        for (Month mon : Month.values()) {
            if (mon.name().equalsIgnoreCase(str)) {
                System.out.println("Місяць існує");
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Місяць не існує");
        }
    }

    private static void task_2() {
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
            System.out.println("Місяців не знайдено");
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
                }
                else if (mon.getDays() % 2 == 1) {
                    System.out.println("Місяць з непарною кількість днів");
                    isFinded = true;
                }
            }
        }
        if (!isFinded) {
            System.out.println("Місяць не знайдено");
        }
    }

    public static void main(String[] args) {

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
