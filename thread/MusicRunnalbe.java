package thread;

public class MusicRunnalbe implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.println("음악재생");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {}
        }
    }
}
