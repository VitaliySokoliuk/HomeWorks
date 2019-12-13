package Task_2;
import java.util.Scanner;
import java.util.Objects;

public class Animal {
    
    public String type;
    public String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static Animal input_animal(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть тип тварини: ");
        String type = scan.nextLine();
        System.out.print("Введіть кличку тварини: ");
        String name = scan.nextLine();
        return new Animal(type, name);
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Animal {" + " type = " + type + ", name = " + name + " }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.type);
        hash = 61 * hash + Objects.hashCode(this.name);
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
