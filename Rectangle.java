package home_work_7;

public class Rectangle {
    
    private int length;
    private int width;
    
    Rectangle(){
        this.length = 5;
        this.width = 3;
    }
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int Square(){
        return length * width;
    }
    public int Perimeter(){
        return 2 * (length + width);
    }
    
    public static void main(String[] args) {
        Rectangle obj_1 = new Rectangle();
        Rectangle obj_2 = new Rectangle(6, 7);
        System.out.println("Площа прямокутника = " + obj_1.Square());
        System.out.println("Периметр прямокутника = " + obj_1.Perimeter());
        
        System.out.println("Площа прямокутника = " + obj_2.Square());
        System.out.println("Периметр прямокутника = " + obj_2.Perimeter());
        
        
        Circle obj_3 = new Circle();
        Circle obj_4 = new Circle(5);
        System.out.println("Площа кола = " + obj_3.Square());
        System.out.println("Довжина кола = " + obj_3.Length());
        
        System.out.println("Площа кола = " + obj_4.Square());
        System.out.println("Довжина кола = " + obj_4.Length());
    }
    
}
