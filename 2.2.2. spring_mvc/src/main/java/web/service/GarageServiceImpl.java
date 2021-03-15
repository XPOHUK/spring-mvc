package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GarageServiceImpl implements GarageService{
    private final List<Car> cars;

    public GarageServiceImpl(){ this.cars = new ArrayList<>();}

    public List<Car> getNCars(int count){
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getAllCars(){return cars;}

    public void addCar(Car car){
        cars.add(car);
    }
}
