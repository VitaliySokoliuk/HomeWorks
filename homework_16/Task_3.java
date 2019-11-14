package homework_16;

public class Task_3 {
    public static void main(String[] args) {
        
        MyList list = new MyList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.print();
        list.removelast();
        list.print();
        list.removebyindex(2);
        list.print();
    }
}
