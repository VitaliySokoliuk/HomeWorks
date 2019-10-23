package Task_2;

public class Kyzov {
    
    private int length;
    private int width;
    
    Kyzov(int length, int width){
        this.length = length;
        this.width = width;
    }
    Kyzov(){}
    
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public String toString() {
        return "Kyzov{" + "length = " + length + ", width=" + width + '}';
    }
    
    public void changeLength(){
        width += 10;
    }
    public void changeWidth(){
        length += 20;
    }
    
    
    
    
}
