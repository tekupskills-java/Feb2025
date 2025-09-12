package Thread;

public class ImplementsRunnableMultipleThreads implements Runnable{

    public static void main(String[] args) {
        ImplementsRunnableMultipleThreads obj = new ImplementsRunnableMultipleThreads();

        Thread thread1 = new Thread(obj);
        thread1.setName("Thread0000");

        Thread thread2 = new Thread(obj);
        thread2.setName("Thread1111");

        Thread thread3 = new Thread(obj);
        thread3.setName("Thread3333");

        thread3.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();

        //OS scheduler  round robin principle

        //data inconsistency

        //synchronization
    }

    @Override
    public void run() {
        System.out.println("Run method "+Thread.currentThread().getName());
    }
}
