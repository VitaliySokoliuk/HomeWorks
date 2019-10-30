package homework_11;

public class AirplaneControl {
    
    public void moveUp(){
        System.out.println("Рух вверх на " + (Math.round(Math.random()*100)) + " м");
    }
    
    public void moveDown(){
        System.out.println("Рух вниз на " + (Math.round(Math.random()*100)) + " м");
    }
    
    public void moveLeft(){
        System.out.println("Рух вліво на " + (Math.round(Math.random()*100)) + " м");
    }
    
    public void moveRight(){
        System.out.println("Рух вправо на " + (Math.round(Math.random()*100)) + " м");
    }
}
