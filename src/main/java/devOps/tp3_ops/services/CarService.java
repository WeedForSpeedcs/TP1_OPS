package devOps.tp3_ops.services;

import devOps.tp3_ops.entities.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() { return cars; }

    public Car addCar(Car car) {
        cars.add(car);
        return car;
    }

    public Car getCarByPlateNumber(String plateNumber) {
        return cars.stream()
                .filter(c -> c.getPlateNumber().equals(plateNumber))
                .findFirst()
                .orElse(null);
    }
}
