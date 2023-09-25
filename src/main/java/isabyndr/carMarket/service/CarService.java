package isabyndr.carMarket.service;

import isabyndr.carMarket.model.Car;
import isabyndr.carMarket.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public void save(Car car){
        carRepository.save(car);
    }

    public List<Car> getAllCar(){
        return carRepository.findAll();
    }
    public Car getCarById(long id){
        return carRepository.findById(id).get();
    }

    public void deleteById(long id){
        carRepository.deleteById(id);
    }

}











