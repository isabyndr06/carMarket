package isabyndr.carMarket.repository;

import isabyndr.carMarket.model.MyCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCarRepository extends JpaRepository<MyCar, Long> {
}
