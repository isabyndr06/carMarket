package isabyndr.carMarket.controller;

import isabyndr.carMarket.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCarController {
    @Autowired
    private MyCarService myCarService;

    @RequestMapping("/deleteMyList{id}")
    public String deleteMyList(@PathVariable("id") Long id){
        myCarService.deleteById(id);
        return "redirect:/my_car";
    }
}




















