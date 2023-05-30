package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao{
    private List<Car> cars = new ArrayList<>();
    public CarDaoImpl(){
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
