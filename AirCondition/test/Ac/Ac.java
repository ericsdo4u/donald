package Ac;
public class Ac {

    private boolean isOn;

    private int temperature = 16;

    public void powerOn() {
        isOn = true;

    }

    public boolean checkPowerIsOn() {
        return isOn;

    }

    public void powerOff() {
        isOn = false;

    }


    public void temperatureIncrese() {
        if (temperature >= 16 && temperature < 30) {
            temperature++;
        }
    }


    public int getTemptIncrement() {

return temperature;


    }

    public void temptDecrease(){
        if (temperature > 16 && temperature <= 30) {
            temperature--;
        }

    }

    public int getTemptDecrease() {

        return temperature;

    }

}
