package Thread;

public class IntroToSynchronizationUsingThread extends Thread{

    public static void main(String[] args) {
       // IntroToSynchronizationUsingThread obj = new IntroToSynchronizationUsingThread();

        IntroToSynchronizationUsingThread t1 = new IntroToSynchronizationUsingThread();
        t1.setName("Ramesh");
        IntroToSynchronizationUsingThread t2 = new IntroToSynchronizationUsingThread();
        t2.setName("Suresh");
        IntroToSynchronizationUsingThread t3 = new IntroToSynchronizationUsingThread();
        t3.setName("Ganesh");


        t1.start();
        t2.start();
        t3.start();
        //

    }

    @Override
    public synchronized void run() {

        //object lock   OS scheduler

        for(int i = 0; i < 3; i++){
            System.out.println("Thread Name is "+Thread.currentThread().getName() + " with index value "+i);
        }

    }
}
