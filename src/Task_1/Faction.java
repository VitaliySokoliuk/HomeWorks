package Task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Faction {

    private String name;

    public Faction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Deputy> deputy_list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void add() {
        Supplier<Deputy> dep = () -> {
            System.out.println("Додамо депутата:");
            System.out.print("Введіть ім'я депутата: ");
            String f_name = scan.next();
            System.out.print("Введіть прізвище депутата: ");
            String l_name = scan.next();
            System.out.print("Введіть вік депутата: ");
            int age = scan.nextInt();
            System.out.print("Введіть вагу депутата: ");
            int weight = scan.nextInt();
            System.out.print("Введіть ріст депутата: ");
            int height = scan.nextInt();
            System.out.print("Депутат хабарник? (true : false): ");
            boolean grafter = scan.nextBoolean();

            return new Deputy(f_name, l_name, age, grafter, weight, height);
        };
        Deputy d = dep.get();
        deputy_list.add(d);
        System.out.println("Новий депутат: " + d.toString());
    }

    Supplier<Deputy> chooseDep = () -> {
        System.out.println("Введіть ім'я депутата");
        String f_name = scan.next();
        System.out.println("Введіть прізвище депутата");
        String l_name = scan.next();

        return new Deputy(f_name, l_name);
    };

    public void remove() {
        System.out.println("Видалимо депутата:");

        Deputy deputy = chooseDep.get();
        Predicate<Deputy> isF_Name_L_NameEquals = deputy1 -> deputy.getFirst_name().equalsIgnoreCase(deputy1.getFirst_name())
                && deputy.getLast_name().equalsIgnoreCase(deputy1.getLast_name());
        Optional<Deputy> deputyIsPresent = deputy_list.stream().findFirst().filter(isF_Name_L_NameEquals);

        if (deputyIsPresent.isPresent()) {
            deputy_list.remove(deputyIsPresent.get());
            System.out.println("Депутат " + deputyIsPresent.get().getFirst_name() + " " + deputyIsPresent.get().getLast_name() + " видалений");
        } else {
            System.out.println("Такого депутата не існує");
        }
    }

    public void all_grafter() {
        System.out.println("Виведемо всіх хабарників у фракції:");
        deputy_list.stream().filter(x -> x.isGrafter() == true).forEach(System.out::println);
    }

    public void biggest_grafter() {
        Comparator<Deputy> compareABribe = (deputy1, deputy2) -> (deputy1.getSize_of_bribe() > deputy2.getSize_of_bribe()) ? 1
                : (deputy1.getSize_of_bribe() == deputy2.getSize_of_bribe()) ? 0
                : -1;
        Optional <Deputy> d = deputy_list.stream().max(compareABribe).filter(Deputy::isGrafter);
        if(d.isPresent()){
            System.out.println("Найбільший хабарник - " + d.get().getFirst_name()+ " " + d.get().getLast_name());
        } else {
            System.out.println("Хабарників у даній фракції немає");
        }
    }

    public void all_deputy() {
        System.out.println("Виведемо всіх депутатів у фракції:");
        deputy_list.stream().forEach(System.out::println);
    }

    public void clean_faction() {
        deputy_list.clear();
        System.out.println("Фракцію очищено");
    }

}
