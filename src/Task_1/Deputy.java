package Task_1;

import java.util.Scanner;
import java.util.function.Supplier;

public class Deputy extends People {

    private String first_name;
    private String last_name;
    private int age;
    private boolean grafter;
    private int size_of_bribe;

    public Deputy(String first_name, String last_name, int age, boolean grafter, int weight, int height) {
        super(weight, height);
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.grafter = grafter;
    }

    public Deputy(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getSize_of_bribe() {
        return size_of_bribe;
    }

    /*public void setSize_of_bribe(int size_of_bribe) {
        this.size_of_bribe = size_of_bribe;
    }*/

    @Override
    public String toString() {
        return "Deputy{" + "first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", grafter=" + grafter + ", size_of_bribe=" + 
                size_of_bribe + '}';
    }
    
    

    public void give_bribe() {
        if (!grafter) {
            System.out.println("Цей депутат не бере хабарів");
        } else {
            int sum_bribe = getBribe.get();
            if (sum_bribe >= 5000) {
                System.out.println("Міліція ув'язнить депутата");
            } else {
                size_of_bribe += sum_bribe;
            }
        }
    }
    Supplier<Integer> getBribe = () -> {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть суму хабаря: ");
        int s_bribe = scan.nextInt();
        return s_bribe;
    };

}
