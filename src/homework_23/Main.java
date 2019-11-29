package homework_23;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        File f_1 = new File("File_1.doc");
        Employee emp = new Employee("Vitaliy", 1, 7000);
        Methods.serialize(f_1, emp);
        System.out.println(Methods.deserialize(f_1));
        
        File f_2 = new File("File_2.txt");
        List<Employee> emp_list = new ArrayList<>();
        emp_list.add(emp);
        emp_list.add(new Employee("Oleg", 2, 7000));
        emp_list.add(new Employee("Dima", 3, 5000));
        emp_list.add(new Employee("Vika", 4, 6000));
        emp_list.add(new Employee("Nazar", 5, 6500));
        
        Methods.serialize(f_2, emp_list);
        System.out.println(Methods.deserialize(f_2));
    }
    
}
