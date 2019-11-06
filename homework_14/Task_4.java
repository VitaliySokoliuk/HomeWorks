package homework_14;
import java.util.Scanner;

public class Task_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.')
                counter++;
        }
        System.out.println(str + ": " + counter +" речень");
        
    }
    
}
