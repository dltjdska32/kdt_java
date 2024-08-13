package thread;

public class ThreadB extends Thread {
    public ThreadB() {
        setName("ThreadB");

    }
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(getName() + " 이 출력한 내용") ;
        }
    }
}
