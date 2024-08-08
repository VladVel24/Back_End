public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("start MyThread 2");
        for (int i = 1000; i < 1010 ; i++) {
            System.out.println("MyThread 2: " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("finish MyThread 2");
    }
}
