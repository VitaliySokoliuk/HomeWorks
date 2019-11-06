package homework_14;
import java.util.Scanner;

public class HomeWork_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] st = str.toCharArray();
        
        boolean f = true;
        if (st.length == 5) {
            for(int i = 0; i < str.length(); i++){
                if(st[i] != st[st.length - i - 1]){
                    System.out.println("Слово не паліндром");
                    f = false;
                    break;
                }
            }
            if(f)
                System.out.println("Слово паліндром");
        } else {
            System.out.println("Слово не з 5 букв");
        }
    }
}
