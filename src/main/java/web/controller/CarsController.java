package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carList(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Модель 1", 1, "Красный"));
        cars.add(new Car("Модель 2", 2, "Синий"));
        cars.add(new Car("Модель 3", 3, "Черный"));
        cars.add(new Car("Модель 4", 4, "Зеленый"));
        cars.add(new Car("Модель 5", 5, "Белый"));
        model.addAttribute("cars", cars.subList(0, Math.max(0, Math.min(cars.size(), count != null ? count : cars.size()))));
        return "cars";
    }

}
