package homework_24;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        MyThread thr1 = new MyThread("one");
        thr1.start();
        thr1.join();
        RunnableThread thr2 = new RunnableThread("two");
        Thread thread = new Thread(thr2);
        thread.start();
    }
    
}
