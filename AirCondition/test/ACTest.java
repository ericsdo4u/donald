import Ac.Ac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ACTest {

    @Test
    public void testTurnAcOn_AcIsOn() {
        Ac myAircondition = new Ac();
      assertFalse(myAircondition.checkPowerIsOn());
        myAircondition.powerOn();
        assertTrue(myAircondition.checkPowerIsOn());

    }

    @Test
    public void testTurnOffAc_AcIsOff() {
        Ac myAircondition = new Ac();
        assertFalse(myAircondition.checkPowerIsOn());

        myAircondition.powerOn();
        assertTrue(myAircondition.checkPowerIsOn());

        myAircondition.powerOff();
        assertFalse(myAircondition.checkPowerIsOn());

    }
@Test
    public void testAcTemperature_Increases(){

        Ac myAircondition = new Ac();

        assertFalse(myAircondition.checkPowerIsOn());
        myAircondition.powerOn();

        assertEquals(16, myAircondition.getTemptIncrement());
        myAircondition.temperatureIncrese();

        assertEquals(17, myAircondition.getTemptIncrement());

    }

    @Test
    public void testCheckTemperatureDecrease_TemperatureDecrease(){


        Ac myAircondition = new Ac();

        assertFalse(myAircondition.checkPowerIsOn());
        myAircondition.powerOn();

        assertEquals(16, myAircondition.getTemptDecrease());
        myAircondition.temptDecrease();
        assertEquals(16, myAircondition.getTemptDecrease());




    }

    @Test
    public void testTemperatureWillNotIncreaseBeyond30_TemperatureIsStill30() {

        Ac myAircondition = new Ac();

        assertFalse(myAircondition.checkPowerIsOn());
        myAircondition.powerOn();

        assertEquals(16, myAircondition.getTemptIncrement());

        for (int count = 1; count <= 30; count++)
            myAircondition.temperatureIncrese();


    }
@Test
    public void testTemperatureWillNotDecreaseBelow16_TemperatureStill16(){

        Ac myAircondition = new Ac();

        assertFalse(myAircondition.checkPowerIsOn());
        myAircondition.powerOn();

        assertEquals(16, myAircondition.getTemptDecrease());

        for(int count = 30; count >= 1; count--)
            myAircondition.temptDecrease();
    }

}
