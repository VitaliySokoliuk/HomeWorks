package Task_2;

public class Kermo {
    
    private int diameter;
    
    Kermo(int diameter){
        this.diameter = diameter;
    }
    Kermo(){}
    
    public int getDiameter(){
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public String toString() {
        return "Kermo{" + "diameter = " + diameter +'}';
    }
    
    public void changeDiameter(){
        diameter += 2;
    }
}
