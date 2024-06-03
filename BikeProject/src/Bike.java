public class Bike {

    private boolean isOn;
    private int speed;

    public void setSpeed(int speedNumber){
        speed = speedNumber;
    }

    public boolean on() {
        if(!isOn){
            isOn=true;
        }
        return true;
    }

    public boolean off() {
        return false;
    }

    public int accelerate(){
        if(speed >= 0 && speed <= 20){
                speed = speed + 1;
        }else if(speed >= 21 && speed <= 30) {
                speed = speed + 2;
        }else if(speed >= 31 && speed <= 40) {
                speed = speed + 3;
        }else {
                speed = speed + 4;
        }
        return speed;
    }

    public int deceleration() {
        if(speed >= 0 && speed <= 20){
            speed = speed - 1;
        }else if(speed >= 21 && speed <= 30) {
            speed = speed - 2;
        }else if(speed >= 31 && speed <= 40) {
            speed = speed - 3;
        }else {
            speed = speed - 4;
        }
        return speed;
    }

    public String setGearIncrease() {
        return getGearLevel();
    }

    public String setGearDecrease() {
        return getGearLevel();
    }

    private String getGearLevel() {
        String gear;
        if(speed >= 0 && speed <= 20){
            gear = "Gear 1";
        }else if (speed >= 21 && speed <= 30) {
            gear = "Gear 2";
        }else if (speed >= 31 && speed <= 40) {
            gear = "Gear 3";
        }else {
            gear = "Gear 4";
        }
        return gear;
    }

    public String switchGear() {
        return getGearLevel();
    }
}
