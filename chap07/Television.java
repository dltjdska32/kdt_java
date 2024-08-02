package chap07;


public class Television implements RemoteControl, Searchable {

    private int volume;

    @Override
    public void search(String url) {
        System.out.println("Searching for: " + url);
    }

    @Override
    public void turnOn() {
        System.out.println("킴");
    }

    @Override
    public void turnOff() {
        System.out.println("끔");
    }

    @Override
    public void setVolume(int volume) {

        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

    }

    public int getVolume() {
        return volume;
    }
}
