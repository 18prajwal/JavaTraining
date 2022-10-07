class MyThread implements Runnable {
    public void run(){
        System.out.println("custom " +Thread.currentThread().getName());
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i +Thread.currentThread().getName());
        }
    }

}


class ThreadImplementsProgram {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main "+Thread.currentThread().getName());
        MyThread t1=new MyThread();
	Thread obj1=new Thread(t1);
        obj1.start();
        obj1.join();
        for(int i=0;i<=10;i++){

            System.out.println(i +" "+Thread.currentThread().getName());
        }

    }
}

