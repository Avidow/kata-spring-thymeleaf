package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String carList(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carService.getCarList().stream().limit(count != null ? count : Integer.MAX_VALUE).toList());
        return "cars";
    }

}
