package homework_22;
import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    
    public static void add(List list, String text){
        list.add(text);
    }
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        add(list, "qwe");
        System.out.println(list.get(0) + " " + list.get(1));
        
    }
    
}
