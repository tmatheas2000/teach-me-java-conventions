package powerpackage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class powerfinderTest {

    @Test
    public void one_raised_to_one_is_onew()
    {
        assertEquals(powerfinder.power(1,1),1);
    }

    @Test
    public void twoRaised_to_one_is_2()
    {
        assertEquals(powerfinder.power(2,1),2);
    }

    @Test
    public void two_power_2_is_4()
    {
        assertEquals(powerfinder.power(2,2),4);
    }

    @Test
    public void power_of_2_and_3_Is_SIX()
    {
        assertEquals(powerfinder.power(3,2),9);
    }


}