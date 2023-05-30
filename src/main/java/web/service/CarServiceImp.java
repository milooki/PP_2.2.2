package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private CarDao cD;
    @Autowired
    public void CarServiceImp(CarDao cD) {
        this.cD = cD;
    }

   // CarDao cD = new CarDaoImpl();


    @Override
    public List<Car> printCars(int count) {
        return cD.printCars(count);
    }
}
