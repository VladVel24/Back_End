public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "start");
        for (int i = 0; i < 1000000; i++) {
            Main.counterInc();
        }
        System.out.println(Thread.currentThread().getName() + "end");
    }
}
