package web.service;

import web.model.Car;

import java.util.List;

/**
 * Package web.service
 * Created at 15.03.2021
 *
 * @author Gubankov D.L.
 */
public interface GarageService {
    List<Car> getNCars(int count);
    List<Car> getAllCars();
    void addCar(Car car);
}
