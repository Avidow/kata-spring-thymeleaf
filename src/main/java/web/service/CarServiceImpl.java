package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Модель 1", 1, "Красный"));
        cars.add(new Car("Модель 2", 2, "Синий"));
        cars.add(new Car("Модель 3", 3, "Черный"));
        cars.add(new Car("Модель 4", 4, "Зеленый"));
        cars.add(new Car("Модель 5", 5, "Белый"));
        return cars;
    }

}
