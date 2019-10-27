package homework_10;

public class Worker_hour implements Salary{
    
    private int hour;
    private int price;
    
    Worker_hour(int hour, int price){
        this.hour = hour;
        this.price = price;
    }
    
    public int result(){
        return hour*price;
    }
    
}
