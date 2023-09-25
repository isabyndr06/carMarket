package isabyndr.carMarket.repository;

import isabyndr.carMarket.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
