package devOps.tp3_ops.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarConstructor() {
        Car car = new Car("ABC123", "Toyota", 15000.0);
        assertEquals("ABC123", car.getPlateNumber());
        assertEquals("Toyota", car.getBrand());
        assertEquals(15000.0, car.getPrice());
    }

    @Test
    public void testSetters() {
        Car car = new Car();
        car.setPlateNumber("XYZ789");
        car.setBrand("BMW");
        car.setPrice(30000.0);
        assertEquals("XYZ789", car.getPlateNumber());
        assertEquals("BMW", car.getBrand());
        assertEquals(30000.0, car.getPrice());
    }
}
