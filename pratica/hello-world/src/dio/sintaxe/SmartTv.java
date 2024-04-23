package dio.sintaxe;

public class SmartTv {
    private boolean isTurnedOn = false;
    private int channel = 1, volume = 5;
    public void toggleTv() {
        isTurnedOn = !isTurnedOn;
    }

    public int changeVolume(int value) {
        if (value == -1 || value == 1)
            volume += value;
        return volume;
    }

    public int changeChannelUp() {
        return ++channel;
    }

    public int changeChannelDown() {
        return --channel;
    }

    public int setChannel(int newChannel) {
        channel = newChannel;
        return channel;
    }

    public void printTvStatus() {
        System.out.println("TV ligada: " + isTurnedOn);
        System.out.println("Canal Atual: " + channel);
        System.out.println("Volume atual: " + volume);
    }

}
