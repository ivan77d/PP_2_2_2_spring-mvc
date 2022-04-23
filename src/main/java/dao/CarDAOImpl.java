package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAOImpl implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Tesla", "Grey", 5.5));
        cars.add(new Car("Lada", "Yellow", 1.2));
        cars.add(new Car("Audi", "Black", 2.5));
        cars.add(new Car("Toyota", "White", 1.8));
        cars.add(new Car("Ferrari", "Red", 8.5));
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
