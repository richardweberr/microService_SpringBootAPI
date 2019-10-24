package com.cars.api.controller;

import com.cars.api.DAO.CarDAO;
import com.cars.api.model.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Api(description="CRUD API for cars")
@RestController
public class ApiController {

    @Autowired
    private CarDAO carDAO;

    //listAll
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public HashMap<Integer, Car> listAllCars() {
        return carDAO.findAll();
    }

    //listByID
    @RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
    public Car listCarById(@PathVariable int id) {
        return carDAO.findById(id);
    }

    //Create
    @RequestMapping(value = {"/addCar"}, method = RequestMethod.POST)
    public HashMap<Integer, Car> saveCar(@RequestBody Car car) {
        return carDAO.create(car);
    }

    //update
    @RequestMapping(value = "/car/update", method = RequestMethod.PUT)
    public Car updateById(@RequestBody Car car) {
        return carDAO.update(car);
    }

    //delete
    @RequestMapping(value = "/car/delete/{id}", method = RequestMethod.DELETE)
    public HashMap<Integer, Car> deleteById(@PathVariable int id) {
        carDAO.delete(id);
        return carDAO.findAll();
    }
}

