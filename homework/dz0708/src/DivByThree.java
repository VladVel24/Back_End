public class DivByThree implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (true){
            i++;
            if(i%3==0){
                System.out.println(i + " three divisor");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
