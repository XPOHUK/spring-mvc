package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Garage;

@Controller
public class CarsController {
    @Autowired
    Garage garage;

    @GetMapping("/cars")
    public String getNCars(@RequestParam(defaultValue = "0") int count, Model model){
        if (count != 0) {
            model.addAttribute("cars", garage.getNCars(count));
        } else {
            model.addAttribute("cars", garage.getAllCars());
        }
        return "cars";
    }
}
