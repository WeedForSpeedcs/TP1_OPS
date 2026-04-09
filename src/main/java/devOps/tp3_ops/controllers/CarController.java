package devOps.tp3_ops.controllers;

import devOps.tp3_ops.entities.Car;
import devOps.tp3_ops.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCarByPlateNumber(@PathVariable String plateNumber) {
        return carService.getCarByPlateNumber(plateNumber);
    }
}
