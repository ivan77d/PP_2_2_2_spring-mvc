package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false)
                               Integer count, ModelMap model) {
        model.addAttribute("cars", carService.getAllCars(count));
        return "cars";
    }
}
