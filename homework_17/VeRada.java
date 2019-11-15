package homework_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VeRada {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Faction> faction_list = new ArrayList<>();
    
    public void add_faction(){
        System.out.print("Введіть назву фракції: ");
        String name = scan.next();
        Faction f = new Faction(name);
        faction_list.add(f);
        System.out.println("Фракцію " + f.getName() + " було додано до ВР");
    }
    
    public void remove_faction(){
        System.out.print("Введіть назву фракції, яку потрібно видалити: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                System.out.println("Фракція " + f.getName() + " видалена");
                iterator.remove();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
    public void show_all_factions(){
        boolean rem = false;
        System.out.println("Виведемо всі фракції у ВР:");
        Iterator<Faction> iterator = faction_list.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            System.out.print(" " + i + ". ");
            System.out.println(f.getName());
            i++;
            rem = true;
        }
        if (!rem)
                System.out.println("Фракцій у ВР немає");
    }
    
    public void show_faction(){
        System.out.print("Введіть назву фракції, яку потрібно вивести: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.all_deputy();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
    public void add_deputy_to_faction(){
        System.out.print("Введіть назву фракції, в яку потрібно додати депутата: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.add();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
    public void remove_deputy_from_faction(){
        System.out.print("Введіть назву фракції, з якої потрібно видалити депутата: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.remove();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }

    public void all_grafter_from_faction(){
        System.out.print("Введіть назву фракції, з якої потрібно вивести хабарників: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.all_grafter();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
    public void biggest_grafter_from_faction(){
        System.out.print("Введіть назву фракції, з якої потрібно вивести найбільшого хабарника: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.biggest_grafter();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
    public void clean_faction(){
        System.out.print("Введіть назву фракції, з якої потрібно видалити всіх депутатів: ");
        String name = scan.next();
        Iterator<Faction> iterator = faction_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Faction f = iterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                f.clean_faction();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такої фракції не існує");
    }
    
}
