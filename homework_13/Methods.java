package homework_13;

public class Methods {
    
    public static void plus(int num1, int num2){
        if (num1 < 0 || num2 < 0)
            throw new IllegalArgumentException("Значення менше нуля");
        else
            System.out.println("Додавання = " + (num1 + num2));
    }
    
    public static void minus(int num1, int num2){
        if (num1 == 0 || num2 == 0)
            throw new ArithmeticException("Значення == нулю");
        else
            System.out.println("Віднімання = " + (num1 - num2));
    }
    
    public static void multiply(int num1, int num2) throws IllegalAccessException{
        if (num1 == 0 && num2 == 0)
            throw new IllegalAccessException("Всі Значення == нулю");
        else
            System.out.println("Множення = " + (num1 * num2));
    }
    
    public static void devide(int num1, int num2) throws MyException{
        if (num1 >= 0 && num2 >= 0)
            throw new MyException();
        else
            System.out.println("Ділення = " + (num1 / num2));
    }
    
}
