package thread.sec01;

public class Customer implements Runnable {
    private final Dish dish;

    public Customer(Dish dish) {
        this.dish = dish;
    }

    private void eat(int i) throws Exception {
        synchronized (dish) {
            // 음식이 비어있을때 wait(대기)
            while (dish.isEmpty())
                dish.wait();

            dish.setEmpty(true);
            System.out.println(i + "번째 음식 다먹음");
            dish.notifyAll(); //다른스레드에 알림
        }
    }

    public void run() {
        for(int i = 0; i < 5; i++){
            try{
                eat(i);
                Thread.sleep(50);
            }catch(Exception e){

            }
        }
    }
}
