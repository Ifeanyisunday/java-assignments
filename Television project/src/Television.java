public class Television {
    private boolean isOn;
    private int channelState;
    private int volumeState;

    Television(){
        this.isOn = false;
        this.volumeState = 1;
        this.channelState = 0;
    }

    public void changeChannelStateByEnteringNumber(int number){
        if(channelState >= 0 && channelState <= 100){
            channelState = number;
        }else{
            System.out.println("invalid channel number");
        }
    }

    public void increaseVolumeByNumber(){
        if(volumeState >= 1 && volumeState <= 100){
            int result = volumeState ++;
        }
    }

    public void decreaseVolumeByNumber(){
        if(volumeState >= 1 && volumeState <= 100){
            volumeState --;
        }
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public void changeChannelByIncreasingNumber() {
        if(initialChannelState() >= 0 && initialChannelState() <= 100){
            channelState++;
        }
    }


    public void changeChannelByDecreasingNumber() {
        if(initialChannelState() > 0 && initialChannelState() <= 100){
            channelState--;
        }
    }

    public int initialChannelState() {
        if(channelState < 0){
            channelState = 0;
        }
        return channelState;
    }

    public int getChannelState(){
        return channelState;
    }
}
