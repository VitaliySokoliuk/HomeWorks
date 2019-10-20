package home_work_7;

public class Circle {
    private float radius;
    private float diameter;
    
    Circle(){
        this.radius = 5;
        this.diameter = this.radius * 2;
    }
    Circle(float radius){
        this.radius = radius;
        this.diameter = this.radius * 2;
    }
    public float Square(){
        return (float)(Math.PI * diameter * diameter)/4;
    }
    public float Length(){
        return (float) (2 * Math.PI * radius);
    }
}
