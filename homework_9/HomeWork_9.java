package homework_9;

public class HomeWork_9 {

    public static void main(String[] args) {
        
        Cow cow = new Cow();
        cow.voice();
        Cat cat = new Cat();
        cat.voice();
        Dog dog = new Dog();
        dog.voice();
        
        System.out.println(String.format("Float.MAX_VALUE - %.3e", Float.MAX_VALUE));
        System.out.println(String.format("Double.MAX_VALUE - %.3e", Double.MAX_VALUE));
        
        Task_4 task = new Task_4(2, 3, 4);
        task.sout();
        
        Amphibia amph = new Frog();
        amph.eat();
        amph.sleep();
        amph.swim();
        amph.walk();
    }
}
