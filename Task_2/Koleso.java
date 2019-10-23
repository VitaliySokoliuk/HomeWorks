package Task_2;

public class Koleso {
    
    private int radius;
    
    Koleso(int radius){
        this.radius = radius;
    }
    Koleso(){}
    
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Koleso{" + "radius = " + radius +'}';
    }
    
    public void changeRadius(){
        radius *= 2;
    }
}
