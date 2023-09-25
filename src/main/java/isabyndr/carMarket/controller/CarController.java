package isabyndr.carMarket.controller;

import isabyndr.carMarket.model.Car;
import isabyndr.carMarket.model.MyCar;
import isabyndr.carMarket.service.CarService;
import isabyndr.carMarket.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private MyCarService myCarService;

    @GetMapping("/home")
    public String getShowHome(){
        return "home";
    }

    @GetMapping("car_register")
    public String carRegister(){
        return "carRegister";
    }

    @GetMapping("cars")
    public ModelAndView getAllCars(){
        List<Car> carList=carService.getAllCar();
        return new ModelAndView("carList","car",carList);
    }

    @PostMapping("/save")
    public String addCar(@ModelAttribute Car car){
        carService.save(car);
        return"redirect:/cars";
    }

    @GetMapping("my_car")
    public String getMyCars(Model model){
        List<MyCar> myCars=myCarService.getAllMyCars();
        model.addAttribute("car", myCars);
        return "myCar";
    }
    @RequestMapping("/myList/{id}")
    public String getMyList(@PathVariable("id") long id){
        Car car=carService.getCarById(id);
        MyCar myCar=new MyCar(car.getId(), car.getBrand(),car.getModel(),car.getColor(),car.getSalePrice(),car.getYear(),car.getKilometer());
        myCarService.saveMyCar(myCar);
        return "redirect:/my_car";
    }

    @RequestMapping("/editCar/{id}")
    public String editCar(@PathVariable("id") long id, Model model){
        Car car=carService.getCarById(id);
        model.addAttribute("car",car);
        return "carEdit";
    }

    @RequestMapping("/deleteCar/{id}")
    public String deleteCar(@PathVariable("id") long id){
        carService.deleteById(id);
        return "redirect:/cars";
    }

}












