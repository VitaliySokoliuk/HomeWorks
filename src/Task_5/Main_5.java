package Task_5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main_5 {

    public static void main(String[] args) {

        Consumer<Frog> frog = x -> {
            x.eat();
            x.sleep();
            x.swim();
            x.walk();
        };

        Supplier<Frog> supp = Frog::new;
        frog.accept(supp.get());

    }
}
