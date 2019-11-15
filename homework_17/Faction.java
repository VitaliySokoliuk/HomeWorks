package homework_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
    
    public void add(){
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
        
        Deputy dep = new Deputy(f_name, l_name, age, grafter, weight, height);
        
        dep.give_bribe();
        deputy_list.add(dep);
        
        System.out.print("Новий депутат: ");
        dep.tostring();
    }
    
    public void remove(){
        System.out.println("Видалимо депутата:");
        System.out.print("Ім'я депутата: ");
        String f_name = scan.next();
        System.out.print("Прізвище депутата: ");
        String l_name = scan.next();
        
        Iterator<Deputy> iterator = deputy_list.iterator();
        boolean rem = false;
        while (iterator.hasNext()) {
            Deputy dep = iterator.next();
            if(dep.getFirst_name().equalsIgnoreCase(f_name) && dep.getLast_name().equalsIgnoreCase(l_name)){
                System.out.println("Депутат " + dep.getFirst_name() + " " + dep.getLast_name() + " видалений");
                iterator.remove();
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Такого депутата не існує");
    }
    
    public void all_grafter(){
        boolean rem = false;
        System.out.println("Виведемо всіх хабарників у фракції:");
        Iterator<Deputy> iterator = deputy_list.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Deputy dep = iterator.next();
            if(dep.isGrafter() == true){
                System.out.print(" " + i + ". ");
                dep.tostring();
                i++;
                rem = true;
            }
        }
        if (!rem)
                System.out.println("Хабарників у даній фракції немає");
    }
    
    public void biggest_grafter(){
        boolean rem = false;
        Iterator<Deputy> iterator = deputy_list.iterator();
        Deputy d = deputy_list.get(0);
        while (iterator.hasNext()) {
            Deputy dep = iterator.next();
            if(dep.isGrafter() == true || d.isGrafter() == true){
                if(dep.getSize_of_bribe() > d.getSize_of_bribe()){
                    d = dep;
                }
                rem = true;
            }else
                d = iterator.next();
        }
        if (!rem)
                System.out.println("Хабарників у даній фракції немає");
        else
            System.out.println("Найбільший хабарник - " + d.getFirst_name() + " " + d.getLast_name());
    }
    
    public void all_deputy(){
        boolean rem = false;
        System.out.println("Виведемо всіх депутатів у фракції:");
        Iterator<Deputy> iterator = deputy_list.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Deputy dep = iterator.next();
            System.out.print(" " + i + ". ");
                dep.tostring();
                i++;
                rem = true;
        }
        if (!rem)
                System.out.println("Депутатів у даній фракції немає");
    }
    
    public void clean_faction(){
        deputy_list.clear();
        System.out.println("Фракцію очищено");
    }
    
}
