package homework_14;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' 
                    || str2.charAt(i) == 'u' || str2.charAt(i) == 'y') {
                str2 = str2.replace(str2.charAt(i), '-');
            }
        }
        System.out.println(str2);
    }
}
