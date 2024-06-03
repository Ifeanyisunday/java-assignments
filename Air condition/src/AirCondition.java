public class AirCondition {

        private boolean isOn;
        private int temperature;

        public void airConditionState(boolean switchState){
            isOn = switchState;
        }

        public void airConditionTemperatureState(int temp){
            temperature = temp;
        }

        public boolean on(){
            if(!isOn){
                isOn = true;
            }
            return true;
        }


        public boolean off(){
            if(isOn){
                isOn = false;
            }
            return false;
        }

        public int increaseTemperature() {
            if(temperature > 16 && temperature <= 30) {
                temperature = temperature + 1;
            }
            return temperature;
        }

        public int decreaseTemperature() {
            if(temperature > 16 && temperature <= 30) {
                temperature = temperature - 1;
            }
            return temperature;
        }

        public int temperatureOutOfRange30() {
            if (temperature >= 30) {
                return temperature = 30;
            } else {
                return increaseTemperature();
            }
        }

    public int temperatureOutOfRange16() {
        if (temperature <= 16) {
            return temperature = 16;
        } else {
            return decreaseTemperature();
        }
    }
}
