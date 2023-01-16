package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest{

    @Test

    public void AirConditionIsOn(){

        //given that i have an ac
        AirCondition airCondition = new AirCondition();
        //when i turn it on
        airCondition.isOn();
        //check that the ac is on
        boolean isOn= airCondition.checkIsOn();
        assertTrue(isOn);
    }

    @Test
    public void AirConditionIsOff(){
        //given that i have an ac
        AirCondition airCondition = new AirCondition();
        //when i turn it on
        airCondition.isOn();
        //check that the ac is off
        boolean isOff = airCondition.checkIsOff();
        assertTrue(isOff);

    }
    @Test
    public void AirConditionIncreaseTemperatureTest(){
        //given that i have an ac
        AirCondition airCondition = new AirCondition();
        //given that my ac is on
        airCondition.isOn();
        //when i increase temperature;
        airCondition.increaseTemperature();
        //check that the temperature has increased
        int number = airCondition.checkIncreaseTemperature();
        int checkIncreaseTemperature = 16;
        assertEquals(16, checkIncreaseTemperature);

    }
    @Test
    public void AirConditionDecreaseTemperature(){
        //given that i have an ac
        AirCondition airCondition = new AirCondition();
        //given that my ac is on
        airCondition.isOn();
        //when i decrease temperature
        airCondition.decreaseTemperature();
        //check that the temperature has decreased
        int number = airCondition.checkDecreasedTemperature();
        int checkDecreasedTemperature = 15;
        assertEquals(15,checkDecreasedTemperature);
    }
    @Test
    public void AirConditionIncreaseTemperatureBeyondTest(){
        //given that i have an ac
        AirCondition airCondition = new AirCondition();
        //given that my ac is on
        airCondition.isOn();
        //when i increase temperature beyond 30




    }
}
