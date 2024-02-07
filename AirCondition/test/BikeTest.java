import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void testThatMyBikeIsOn_BikeIsOn() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

    }

    @Test
    public void testThatBikeIsOff() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());
        myBike.powerOff();
        assertFalse(myBike.checkPowerOn());


    }

    @Test
    public void testThatBikeCan_Accelerate1() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 0; count <= 15; count++) {
            myBike.accelerate();
        }
        assertEquals(1, myBike.getGear());
        assertEquals(16, myBike.getAccelerate());

    }

    @Test
    public void testThatBikeCan_Accelerate2() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 0; count <= 22; count++) {
            myBike.accelerate();
        }
        assertEquals(2, myBike.getGear());
        assertEquals(25, myBike.getAccelerate());

    }

    @Test
    public void testThatBikeCan_Accelerate3() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 1; count < 30; count++) {
            myBike.accelerate();
        }
        assertEquals(3, myBike.getGear());
        assertEquals(40, myBike.getAccelerate());

    }


    @Test
    public void testThatBikeCan_Accelerate4() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 1; count < 41; count++) {
            myBike.accelerate();
        }
        assertEquals(4, myBike.getGear());
        assertEquals(83, myBike.getAccelerate());

    }


    @Test
    public void testThatBikeCanDecrease_Accelerate1() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 1; count < 15; count++) {
            myBike.accelerate();
       }

        for (int count = 1; count < 1; count++) {
            myBike.decreaseAccelerate();
        }
        assertEquals(1, myBike.getGear());
        assertEquals(14, myBike.getAccelerate());

    }

    @Test
    public void testThatBikeCanDecrease_Accelerate2() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 0; count < 23; count++) {
            myBike.accelerate();
        }
        assertEquals(25, myBike.getAccelerate());
        for (int count = 0; count < 2; count++) {
            myBike.decreaseAccelerate();
        }
       assertEquals(2, myBike.getGear());
       assertEquals(21, myBike.getAccelerate());

    }


    @Test
    public void testThatBikeCanDecrease_Accelerate3() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 0; count < 27; count++) {
            myBike.accelerate();
        }
        assertEquals(34, myBike.getAccelerate());
        for (int count = 1; count < 3; count++) {
            myBike.decreaseAccelerate();
        }
        assertEquals(3, myBike.getGear());
        assertEquals(28, myBike.getAccelerate());

    }


    @Test
    public void testThatBikeCanDecrease_Accelerate4() {

        Bike myBike = new Bike();

        assertFalse(myBike.checkPowerOn());
        myBike.PowerOn();
        assertTrue(myBike.checkPowerOn());

        for (int count = 0; count < 37; count++) {
            myBike.accelerate();
        }
        assertEquals(71, myBike.getAccelerate());
        for (int count = 1; count < 4; count++) {
            myBike.decreaseAccelerate();
        }
        assertEquals(4, myBike.getGear());
        assertEquals(59, myBike.getAccelerate());

    }



}
