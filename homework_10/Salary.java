package homework_10;

public interface Salary {
    default void salary(int z){
        System.out.println("Your salary is " + z);
    };
}
