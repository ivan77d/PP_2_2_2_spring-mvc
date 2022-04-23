package service;

import dao.CarDAO;
import dao.CarDAOImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
private CarDAO carDAO = new CarDAOImpl();
    @Override
    public List<Car> getAllCars(Integer count) {
        return carDAO.getAllCars(count);
    }
}
