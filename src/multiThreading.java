public class multiThreading {

    public static void main(String[] args) throws InterruptedException {

        MyThread1 thread1 = new MyThread1();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000); //vai esperar a thread morrer pra startar
        thread2.start();

 
    }

}