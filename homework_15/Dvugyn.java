package homework_15;

public class Dvugyn {
    
    private int chulindres;
    
    Dvugyn(){
        this.chulindres = (int)(4 + Math.random() * 8);
    }
    
    public int getChulindres(){
        return chulindres;
    }
}
