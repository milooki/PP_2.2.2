package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

        private List<Car> cars = new ArrayList<>();
    public CarServiceImp(){
        cars.add(new Car("KIA", "Sportage", 1));
        cars.add(new Car("Volvo", "XC60", 2));
        cars.add( new Car("Lada", "Vesta", 1));
        cars.add( new Car("KIA", "Stinger", 1));
        cars.add( new Car("Nissan", "Juke", 2));
    }
    @Override
    public List<Car> printCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
