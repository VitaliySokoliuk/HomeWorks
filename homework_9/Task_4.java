package homework_9;

public class Task_4 {
    
    private int x;
    private int y;
    private int z;
    
    Task_4(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    Task_4(int x, int y, int z){
        this(x, y);
        this.z = z;
    }
    
    public void sout(){
        System.out.println(String.format("X = %d, Y = %d, Z = %d", x, y, z));
    }
}
