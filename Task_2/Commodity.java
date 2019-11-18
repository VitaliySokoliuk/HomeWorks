package Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Commodity {

    String name;
    int weight;
    int lenght;
    int width;

    public Commodity(String name, int weight, int lenght, int width) {
        this.name = name;
        this.weight = weight;
        this.lenght = lenght;
        this.width = width;
    }
    
    public Commodity() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.weight;
        hash = 97 * hash + this.lenght;
        hash = 97 * hash + this.width;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commodity other = (Commodity) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Товар { " + "назва = " + name + ", вага = " + weight + ", довжина = " + lenght + ", ширина = " + width + "}";
    }
    
    private Commodity new_comm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть інформацію про товар:");

        System.out.print("Назва товару: ");
        String name = scanner.nextLine();
        System.out.print("Вага товару: ");
        int weight = scanner.nextInt();
        System.out.print("Довжина товару: ");
        int lenght = scanner.nextInt();
        System.out.print("Ширина товару: ");
        int width = scanner.nextInt();

        return new Commodity(name, weight, lenght, width);
    }

    Set<Commodity> comm = new LinkedHashSet<>();
    
    public void show(){
        System.out.println(comm.toString());
    }

    public void add_commodity() {

        Commodity c = new_comm();
        
        if (!comm.contains(c)) {
            comm.add(c);
            System.out.println("Додано новий товар");
        }else {
            System.out.println("Такий товар вже існує");
        }
    }
    
    public void remove_commodity() {

        Commodity c = new_comm();
        
        if (comm.contains(c)) {
            comm.remove(c);
            System.out.println("Видалено товар");
        }else {
            System.out.println("Такого товару не існує");
        }
    }
    
    public void replace_commodity(){
        
        System.out.println("Введіть дані товару, який потрібно замінити:");
        Commodity c = new_comm();
        System.out.println("Введіть дані нового товару:");
        Commodity c_n = new_comm();
        if (comm.contains(c)) {
            comm.remove(c);
            comm.add(c_n);
            System.out.println("Товар замінено");
        }else {
            System.out.println("Такого товару не існує");
        }
    }
    
    public void sort_by_name(){
        List<Commodity> com = new ArrayList<>(comm);
        Collections.sort(com, new Sort_1());
        comm = new LinkedHashSet<>(com);
    }
    
    public void sort_by_weight(){
        List<Commodity> com = new ArrayList<>(comm);
        Collections.sort(com, new Sort_2());
        comm = new LinkedHashSet<>(com);
        show();
    }
    
    public void sort_by_lenght(){
        List<Commodity> com = new ArrayList<>(comm);
        Collections.sort(com, new Sort_3());
        comm = new LinkedHashSet<>(com);
        show();
    }
    
    public void sort_by_width(){
        List<Commodity> com = new ArrayList<>(comm);
        Collections.sort(com, new Sort_4());
        comm = new LinkedHashSet<>(com);
        show();
    }
    
    public void sout_i_el(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть індекс елемента, який потрібно вивести: ");
        int n = scanner.nextInt();
        for(int i = 0; i < comm.size(); i++){
            if (n >= comm.size()) {
                System.out.println("Елемента з таким індексом не існує");
                break;
            }
            if (i == n) {
                System.out.println(comm.toArray()[i]);
            }
        }
    }
}