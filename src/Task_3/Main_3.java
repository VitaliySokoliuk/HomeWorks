package Task_3;

public class Main_3 {
    public static void main(String[] args) {
        
        Func fl = str -> System.out.println(str);
        fl.print(String.format("Float.MAX_VALUE - %.3e", Float.MAX_VALUE));
        fl.print(String.format("Float.MIN_VALUE - %.3e", Float.MIN_VALUE));

        Func db = str -> System.out.println(str);
        db.print(String.format("Double.MAX_VALUE - %.3e", Double.MAX_VALUE));
        db.print(String.format("Double.MAX_VALUE - %.3e", Double.MAX_VALUE));
        
    }
}
