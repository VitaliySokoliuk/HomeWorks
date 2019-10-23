package Task_3;

public class HW_8_3 {
    public static void main(String[] args) {
        
        Animal an = new Animal("Пес", 45, 5);
        System.out.println("Кличка кота - " + an.getName());
        an.setAll("Бик", 2, 14);
        System.out.println("Назва тварини - " + an.getName() + ", швидкість тварини - " + an.getSpeed() + ", вік тварини - " + an.getAge());
        an.setAll("Леопард", 20, 7);
        System.out.println("Назва тварини - " + an.getName() + ", швидкість тварини - " + an.getSpeed() + ", вік тварини - " + an.getAge());
    }
    
}
