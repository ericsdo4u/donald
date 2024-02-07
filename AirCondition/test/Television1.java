public class Television1 {

    private boolean isTurnOn;
    private int volume;
    private int channel;



    public void turnOnTv() {

        isTurnOn = true;
    }
    public boolean checkState() {

        return isTurnOn;
    }
    public void turnOff() {

        isTurnOn = false;
    }

    public void increaseVolume() {
        if (isTurnOn && volume >= 0 && volume <= 100) {
            volume++;
        }
    }

    public int getVolume() {
        return volume;

    }

    public void decreaseVolume() {
        if (isTurnOn && volume > 0 && volume <= 100){
            volume--;
        }
    }

    public void changeIncrementChannel() {

        if (isTurnOn && channel >= 0 && channel <= 100){
            channel++;

        }
    }
    public int getChannel(){
        return channel;
    }

    public void decrementChannel() {
        if (isTurnOn && channel > 0 && channel <= 100){
            channel--;
        }
    }
}
