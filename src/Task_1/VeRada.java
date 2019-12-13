package Task_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VeRada {
    
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Faction> faction_list = new ArrayList<>();
    
    Supplier<Faction> factionSupplier = () -> {
        System.out.println("Введіть назву фракції: ");
        String name = scan.next();
        return new Faction(name.toString());
    };
    
    public Optional<Faction> factionIsPresent(){
        Faction f = factionSupplier.get();

        Predicate <Faction> isNameEquals  = (f1 -> f1.getName().equalsIgnoreCase(f.getName()));
        Optional <Faction> factionIsPresent = faction_list.stream().filter(isNameEquals).findFirst();

        return factionIsPresent;
    }
    
    
    public void add_faction(){
        Faction f = factionSupplier.get();
        faction_list.add(f);
        System.out.println("Фракцію " + f.getName() + " було додано до ВР");
    }
    
    public void remove_faction(){
        Optional<Faction> f = factionIsPresent();
        if (f.isPresent()){
            faction_list.remove(f.get());
            System.out.println("Фракція " + f.get().getName() + " видалена");
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
    public void show_all_factions(){
        System.out.println("Виведемо всі фракції у ВР:");
        faction_list.stream().forEach(System.out::println);
    }
    
    public void show_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().all_deputy();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
    public void add_deputy_to_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().add();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
    public void remove_deputy_from_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().remove();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }

    public void all_grafter_from_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().all_grafter();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
    public void biggest_grafter_from_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().biggest_grafter();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
    public void clean_faction(){
        Optional<Faction> f = factionIsPresent();
        if(f.isPresent()){
            f.get().clean_faction();
        } else {
            System.out.println("Такої фракції не існує");
        }
    }
    
}
