package web.service;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    CarDao cD = new CarDaoImpl();
    @Override
    public List<Car> printCars(int count) {
        return cD.printCars(count);
    }
}
