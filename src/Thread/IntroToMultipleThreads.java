package Thread;

public class IntroToMultipleThreads extends Thread{

    public static void main(String[] args) {
        IntroToMultipleThreads thread1 = new IntroToMultipleThreads();
        thread1.setName("DummyThread1");

        IntroToMultipleThreads thread2 = new IntroToMultipleThreads();
        thread2.setName("DummyThread2");

        thread1.start();
        thread2.start();

    }


    @Override
    public void run() {
        System.out.println("Run method "+Thread.currentThread().getName());
    }
}
