import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Television1Test {

    @Test
    public void testThatTelevisionIsOn(){
        Television1 myTelevision1 = new Television1();

        assertFalse(myTelevision1.checkState());
        myTelevision1.turnOnTv();
        assertTrue(myTelevision1.checkState());
    }
    @Test
    public void testThatTelevisionIsOff(){
        Television1 myTelevision1 = new Television1();

        assertFalse(myTelevision1.checkState());
        myTelevision1.turnOnTv();
        assertTrue(myTelevision1.checkState());

        myTelevision1.turnOff();
        assertFalse(myTelevision1.checkState());

    }

    @Test
    public void testVolumeIncrease(){
        Television1 myTelevision1 = new Television1();

    myTelevision1.turnOnTv();
    assertTrue(myTelevision1.checkState());

    for(int count = 0; count <= 99; count++){
        myTelevision1.increaseVolume();
    }
    assertEquals(100, myTelevision1.getVolume());

    }

    @Test
    public void testVolumeDercrement(){

        Television1 myTelevision1 = new Television1();

        myTelevision1.turnOnTv();
        assertTrue(myTelevision1.checkState());

        for (int count = 0; count >= 99; count++) {
            myTelevision1.decreaseVolume();
        }
        assertEquals(0, myTelevision1.getVolume());
    }

    @Test
    public void testChannelIncrement(){
        Television1 myTelevision1 = new Television1();

        myTelevision1.turnOnTv();
        assertTrue(myTelevision1.checkState());

        for (int count = 0; count <= 99; count++) {
            myTelevision1.changeIncrementChannel();
        }
        assertEquals(100, myTelevision1.getChannel());

    }

    @Test
    public void testChannelDecrement(){
        Television1 myTelevision1 = new Television1();

        myTelevision1.turnOnTv();
        assertTrue(myTelevision1.checkState());
        for (int count = 0; count <= 99; count++) {
            myTelevision1.decrementChannel();
        }
        assertEquals(0, myTelevision1.getChannel());

    }



}