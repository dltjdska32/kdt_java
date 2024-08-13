package thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnalbe());
        thread2.start();
    }
}
