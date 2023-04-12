package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> list;

    public CarServiceImpl() {
        list = new ArrayList<>();
        list.add(new Car("Toyota Camry", 223));
        list.add(new Car("Lexus", 125));
        list.add(new Car("Kia Rio", 352));
        list.add(new Car("Ford Transit", 722));
        list.add(new Car("Volvo", 884));
    }

    @Override
    public List<Car> getlistCars(Integer count) {
        if (count >= 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }
}
