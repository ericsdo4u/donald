public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public void PowerOn(){
        isOn = true;
        gear = 1;
    }

    public boolean checkPowerOn() {
        return isOn;
    }


    public void powerOff() {

        isOn = false;

    }
    public void accelerate(){
        changeGear();
        if(isOn && gear == 1){
            speed += 1;
        }

        if(isOn && gear == 2){
            speed += 2;
        }

        if(isOn && gear == 3){
            speed += 3;
        }

        if(isOn && gear == 4){
            speed += 4;
        }


    }


    public int getAccelerate() {
       return speed;

    }


    public void decreaseAccelerate(){

        changeGear();

        if(isOn && gear == 1){
            speed -= 1;
        }

        if(isOn && gear == 2){
            speed -= 2;
        }

        if(isOn && gear == 3){
            speed -= 3;
        }

        if(isOn && gear == 4){
            speed -= 4;
        }


    }

    public void changeGear() {
        if (speed > 0 && speed <= 20){
            gear = 1;
        }
        if (speed > 20 && speed <= 30){
            gear = 2;
        }
        if (speed > 30 && speed <= 40){
            gear = 3;
        }
         if (speed > 40){
            gear = 4;
        }

    }

    public int getGear(){

        return gear;
    }


}
