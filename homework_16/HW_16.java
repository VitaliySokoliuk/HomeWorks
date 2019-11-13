package homework_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HW_16 {

    static Scanner scan;

    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1.Вивести дані елементів. ");
        System.out.println("\t2.Для всіх елементів встановити значення рік - 2000. ");
        System.out.println("\t3.Сортування за спаданням. ");
        System.out.println("\t4.Сортування за зростанням. ");
        System.out.println("Введи \"quit\" щоб вийти. ");
    }

    private static void task_1(ArrayList<Avto> av) {
        System.out.println(av);
    }

    private static void task_2(ArrayList<Avto> av) {

        for (int j = 0; j < av.size(); j++) {
                av.get(j).setYear(2000);
        }
        System.out.println("\nЗначення рік буде встановлено: 2000");
        System.out.println(av);
    }

    private static void task_3(ArrayList<Avto> av) {
        Collections.sort(av, new Sort2());
        System.out.println(av);
    }

    private static void task_4(ArrayList<Avto> av) {
        Collections.sort(av, new Sort());
        System.out.println(av);
    }

    public static void main(String[] args) {
        ArrayList<Avto> av = new ArrayList<>();
        
        int m = (int) (3 + Math.random() * 4);
        int n = (int) (3 + Math.random() * 4);
        System.out.println("m - " + m + ", n - " + n);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                av.add(new Avto());
            }
        }
        System.out.println(av);

        scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    task_1(av);
                    break;
                case "2":
                    task_2(av);
                    break;
                case "3":
                    task_3(av);
                    break;
                case "4":
                    task_4(av);
                    break;
            }
            menu();
            line = scan.next();
        }
    }
}
