package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars(int count);

}