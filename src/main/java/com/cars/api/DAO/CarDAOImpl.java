package com.cars.api.DAO;

import com.cars.api.model.Car;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class CarDAOImpl implements CarDAO {

    private static HashMap<Integer, Car> cars = new HashMap<Integer, Car>();

    static {
        cars.put(0, new Car(0,"Audi", "A2"));
        cars.put(1, new Car(1,"BMW", "116i"));
        cars.put(2, new Car(2,"NSU", "Prinz"));
    }

    @Override
    public HashMap<Integer, Car> findAll() {
        return cars;
    }

    @Override
    public Car findById(int id) {
        return cars.get(id);
    }

    @Override
    public HashMap<Integer, Car> create(Car car) {
        cars.put(car.getCarId(), car);
        return cars;
    }

    @Override
    public Car update(Car car) {
        cars.put(car.getCarId(), car);
        return cars.get(car.getCarId());
    }

    @Override
    public HashMap<Integer, Car> delete(int id) {
        cars.remove(id);
        return cars;
    }
}
