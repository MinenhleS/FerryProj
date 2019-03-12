import org.junit.jupiter.api.Test;
import AnyPack.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test

    public void ShoulReturnFerry(){
        Car varValue = new Car("Blue", 2);
        System.out.printf("Color: " +  varValue.getColour());
        assertEquals(2,2);
    }
}
