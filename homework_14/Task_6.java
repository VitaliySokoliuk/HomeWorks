package homework_14;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st;
        str = str.replace(".", "");
        str = str.replace(",", "");
        str = str.replace("!", "");
        str = str.replace("?", "");
        str = str.replace(":", "");
        String[] s = str.toLowerCase().split(" ");
        
        int pos = 0;
        int counter = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if(s[i].equals(s[j])){
                    counter++;
                }
            }
            if(counter > pos)
                pos = i;
            count = counter;
            counter = 0;
        }
        System.out.println("Слово " + s[pos] + " зустрічається " + count + " раз");
    }
}
