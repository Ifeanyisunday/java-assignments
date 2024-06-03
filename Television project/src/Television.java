import java.util.function.Supplier;

public class Television {
    private boolean isOn;
    private int channelState;

    public void setChannelState(int number){
        channelState = number;
    }

    public boolean switchOn() {
            return true;
    }

    public boolean switchOff() {
            return false;
    }

    public String changeChannelByIncreasingNumber(int number) {
        setChannelState(number);
        channelState++;
        return "Channel " + String.valueOf(channelState++);
    }


    public String changeChannelByDecreasingNumber(int number) {
        setChannelState(number);
        channelState--;
        return "Channel " + String.valueOf(channelState);
    }

    public String exactChannel(int number) {
        setChannelState(number);
        return "Channel " + String.valueOf(channelState);
    }
}
