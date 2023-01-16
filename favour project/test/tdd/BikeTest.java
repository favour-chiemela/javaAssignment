package tdd;

import chapterTwo.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest{
    @Test
    public void BikeIsOn(){
        // given that i have a bike
        Bike bike = new Bike();
        // given that my bike is on
        Bike.isOn();
        // check that the bike is on
        boolean isOn = Bike.checkIsOn();
        boolean isOn1 = isOn;
        assertTrue(isOn);
    }@Test
    public void BikeIsOff(){
        // given that i have a bike
        Bike bike = new Bike();
        //check that my bike is off
        boolean isOff = Bike.checkIsOff();
        assertTrue(isOff);
    }
    @Test
    public void BikeAcceleration(){
        //given that i have a bike
        Bike bike = new Bike();
        //given that my bike is on
        BikeIsOn();
        //given that my bike can be accelerated

    }
}
