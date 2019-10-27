package com.lgs.lab.interface2;
import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
    
    private int num1;
    private int num2;
    
    public MyCalculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
   public void plus(){
        System.out.println("Додавання = " + (num1 + num2));
    }
    
    @Override
    public void minus(){
        System.out.println("Віднімання = " + (num1 - num2));
    }
    
    @Override
    public void multiply(){
        System.out.println("Множення = " + (num1 * num2));
    }
    
    @Override
    public void devide(){
        System.out.println("Ділення = " + (num1 / num2));
    }
    
}
