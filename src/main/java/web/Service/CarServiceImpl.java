package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("audi", 1, "black"));
        cars.add(new Car("bmw", 2, "white"));
        cars.add(new Car("jaguar", 3, "grey"));
        cars.add(new Car("porsche", 4, "pink"));
        cars.add(new Car("priora", 5, "black"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
