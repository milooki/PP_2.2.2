package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;


@Controller
public class CarController {
    @Autowired
    private final CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam (value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.printCars(count));
        return "/cars";
    }

}