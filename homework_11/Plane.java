package homework_11;

public abstract class Plane implements SpecialPossibility{
    
    private int length;
    private int width;
    private int weight;
    
    Plane(int length, int width, int weight){
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void launchEngine() {
        System.out.println("Готові вилетіти через " + (Math.round(20 + Math.random() * 68)) + " хв");
    }

    public void takeOffPlane() {
        System.out.println("Літак пролетить " + (Math.random() * 1000) + " км");
    }
    
    public void landPlane(){
        System.out.println("Літак іде на посадку");
    }

}
