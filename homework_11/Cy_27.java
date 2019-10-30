package homework_11;

public class Cy_27 extends Plane{

    private int maxspeed;
    private String color;
    private int length;
    private int width;
    private int weight;
    private AirplaneControl ac;
    
    Cy_27(int length, int width, int weight, int maxspeed, String color){
        super(length, width, weight);
        this.maxspeed = maxspeed;
        this.color = color;
        this.ac = new AirplaneControl();
    }
    
    public AirplaneControl getAC(){
        return ac;
    }
    
    @Override
    public void turbo() {
        System.out.println("Нова швидкість літака: " + (maxspeed + Math.random() * 1000) + " км/год");
    }

    @Override
    public void stealth() {
        System.out.println("Літака не видно: " + (1 + Math.random() * 15) + " сек");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Буде скинуто: " + (Math.round(1 + Math.random() * 9)) + " ядерних боєголовок");
    }
    
    
}
