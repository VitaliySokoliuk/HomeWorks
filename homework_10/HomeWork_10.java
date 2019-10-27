package homework_10;
import com.lgs.lab.interface2.MyCalculator;

public class HomeWork_10 {

    public static void main(String[] args) {
        
        Worker_hour worker1 = new Worker_hour(40, 50);
        worker1.salary(worker1.result());
        
        Worker_month worker2 = new Worker_month(true, 3000);
        worker2.salary(worker2.result());
        
        MyCalculator calc = new MyCalculator(5, 8);
        calc.plus();
        calc.minus();
        calc.multiply();
        calc.devide();
    }
}
