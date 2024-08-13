package thread;

class TotalThread extends Thread {
    int total;
    public void run() {
        synchronized (this) {
            for(int i = 0; i <= 100; i++){
                System.out.println(total);
                total += i;
                notify();
            }
        }
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        TotalThread t = new TotalThread();
        t.start();
        synchronized (t) {
            try {
                System.out.println("스레드 t 끝날때 까지 대기");
                t.wait();
            } catch (InterruptedException e) {}

        }
        System.out.println("총합 : " + t.total);
    }
}
