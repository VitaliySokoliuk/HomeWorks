package Task_4;

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

    @Override
    public String toString() {
        return "Task_4 {" + " x = " + x + ", y = " + y + ", z = " + z + " }";
    }
    
    
    
}
