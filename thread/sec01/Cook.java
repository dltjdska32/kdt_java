package thread.sec01;

public class Cook implements Runnable {
    private final Dish dish;

    public Cook(Dish dish) {
        this.dish = dish;

    }

    private void cook(int i) throws InterruptedException {
        synchronized (dish) {
            while (!dish.isEmpty()) {
                dish.wait();
            }
            dish.setEmpty(false);
            System.out.println(i + "번째 음식 준비");
            dish.notify();
        }
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                cook(i);
                Thread.sleep(50);
            } catch(InterruptedException e) {}
        }
    }
}
