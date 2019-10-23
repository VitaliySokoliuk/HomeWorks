package Task_3;

public class Animal {
    private String name;
    private int speed;
    private int age;
    
    Animal(String name, int speed, int age){
        this.name = name;
        this.speed = speed;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAll(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }
    
    
}
