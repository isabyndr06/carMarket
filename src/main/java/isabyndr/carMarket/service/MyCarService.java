package isabyndr.carMarket.service;

import isabyndr.carMarket.model.MyCar;
import isabyndr.carMarket.repository.MyCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCarService {
    @Autowired
    private MyCarRepository myCarRepository;

    public void saveMyCar(MyCar mycar){
        myCarRepository.save(mycar);

    }
    public List<MyCar> getAllMyCars(){
        return myCarRepository.findAll();
    }
    public void deleteById(long id){
        myCarRepository.deleteById(id);
    }



}
