package Task_1;

public class Main {

    public static void main(String[] args) {

        Pet cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
        Pet dog = () -> System.out.println("Я пес-Гаууу-Гаууу");
        Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");

        cat.voice();
        dog.voice();
        cow.voice();

    }

}
