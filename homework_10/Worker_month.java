package homework_10;

public class Worker_month implements Salary{
    
    private boolean work;
    private int price;
    
    Worker_month(boolean work, int price){
        this.work = work;
        this.price = price;
    }
    
    public int result(){
        if (work)
            return price;
        else
            return 0;
    }
    
}
