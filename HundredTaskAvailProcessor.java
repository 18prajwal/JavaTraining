import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {

    public void run() {
        System.out.println("Name of the thread "+Thread.currentThread().getName());

    }
}



class HundredTaskAvailProcessor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for(int i=0;i<100;i++) {
            MyThread t1 = new MyThread();
            service.execute(t1);
        }
            service.shutdown();
    }

}


