public class DivByTwo extends Thread  {

    public void run(){
        int i = 1;
        while (true){
            i++;
            if (i % 2 == 0){
                System.out.println(i + " is even");
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
