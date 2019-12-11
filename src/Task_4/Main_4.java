package Task_4;

public class Main_4 {
    public static void main(String[] args) {
        
        Interface inf = Task_4::new;
        Task_4 t4 = inf.create(3,4,5);
        System.out.println(t4.toString());
        
    }
}
