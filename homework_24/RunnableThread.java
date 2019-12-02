package homework_24;

import java.util.Scanner;

public class RunnableThread implements Runnable{

    String name;
    private final int DELAY = 1000;

    public RunnableThread(String name) {
        super();
        this.name = name;
    }
    
    @Override
    public void run() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть кількість чисел Фібоначчі: ");
            int n = scanner.nextInt();
            int[] mass = new int[n];
            mass[0] = 1;
            mass[1] = 1;
            for(int i = 2; i < mass.length; i++){
                mass[i] = mass[i-1] + mass[i-2];
            }
            System.out.print("Потік " + name + ": ");
            for(int i = mass.length-1; i >= 0; i--){
                System.out.print(mass[i] + " ");
                Thread.sleep(DELAY);
            }System.out.println("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
