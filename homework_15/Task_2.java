package homework_15;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    static Scanner scan;

    private static void menu() {
        System.out.println("Зроби вибір: ");
        System.out.println("\t1.Вивести дані елементів. ");
        System.out.println("\t2.Для всіх елементів встановити значення первинного об'єкта. ");
        System.out.println("\t3.Сортування за спаданням. ");
        System.out.println("\t4.Сортування за зростанням. ");
        System.out.println("Введи \"quit\" щоб вийти. ");
    }

    private static void task_1(Avto[][] avto) {
        System.out.println(Arrays.deepToString(avto));
    }

    private static void task_2(Avto[][] avto) {
        Avto avt = new Avto();
        System.out.println("\nПервинний об'єкт: " + avt.toString());
        for (int j = 0; j < avto.length; j++) {
            for (int i = 0; i < avto[j].length; i++) {
                Arrays.fill(avto[i], avt);
            }
        }

        System.out.println(Arrays.deepToString(avto));
    }
    
    private static void task_3(Avto[][] avto) {
        for (int j = 0; j < avto.length; j++) {
            for (int i = 0; i < avto[j].length; i++) {
                Arrays.sort(avto[i], new Sort2());
            }
        }
        System.out.println(Arrays.deepToString(avto));
    }
    
    private static void task_4(Avto[][] avto) {
        for (int j = 0; j < avto.length; j++) {
            for (int i = 0; i < avto[j].length; i++) {
                Arrays.sort(avto[i], new Sort());
            }
        }
        System.out.println(Arrays.deepToString(avto));
    }

    public static void main(String[] args) {

        int m = (int) (3 + Math.random() * 4);
        int n = (int) (3 + Math.random() * 4);
        System.out.println("m - " + m + ", n - " + n);
        Avto[][] avto1 = new Avto[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                avto1[i][j] = new Avto();
            }
        }

        System.out.println(Arrays.deepToString(avto1));

        scan = new Scanner(System.in);
        menu();
        String line = scan.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    task_1(avto1);
                    break;
                case "2":
                    task_2(avto1);
                    break;
                case "3":
                    task_3(avto1);
                    break;
                case "4":
                    task_4(avto1);
                    break;
            }
            menu();
            line = scan.next();
        }

    }
}
