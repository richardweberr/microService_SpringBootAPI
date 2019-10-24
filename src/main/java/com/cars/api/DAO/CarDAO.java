package com.cars.api.DAO;

import com.cars.api.model.Car;

import java.util.HashMap;

public interface CarDAO {
    public HashMap<Integer, Car> findAll();

    public Car findById(int id);

    public HashMap<Integer, Car> create(Car car);

    public Car update(Car car);

    public HashMap<Integer, Car> delete(int id);
}
