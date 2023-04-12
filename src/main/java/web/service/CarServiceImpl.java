package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private static int CARS_COUNT;
    private List<Car> list;

    public CarServiceImpl() {
       list = new ArrayList<>();
       list.add(new Car(++CARS_COUNT,"Toyota Camry", 223));
       list.add(new Car(++CARS_COUNT,"Lexus", 125));
       list.add(new Car(++CARS_COUNT,"Kia Rio", 352));
       list.add(new Car(++CARS_COUNT,"Ford Transit", 722));
       list.add(new Car(++CARS_COUNT,"Volvo", 884));
    }
    @Override
    public List<Car> getlistCars(int count) {
        return list;
    }
}
