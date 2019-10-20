package homework_5;
import java.util.Scanner;

public class HomeWork_5 {
    ////////////// 3 завдання
    /**
     * 
     * @param x перший доданок
     * @param y Другий доданок
     * @return сума
     */
    
    static int plus(int x, int y) {
        return x + y;
    }

    /**
     * 
     * @param a ділене
     * @param b дільник
     * @return частка
     */
    
    static int dil(int a, int b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        ////////////// 1 завдання
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5;
        double f = 6;
        char g = 'q';
        boolean w = true;
        ////////////// 2 завдання
        System.out.println("Byte: " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
        ////////////// 4 завдання
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] word = str.split(" ");
        System.out.println(word.length);
        for(int i = 0; i < word.length; i++)
            System.out.println(word[i] + " " +word[i].length());
    }
    
}
