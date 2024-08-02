package chap07;

public class Radio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오 킴");
    }
    @Override
    public void turnOff() {
        System.out.println("라디오 끔");
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
