package isabyndr.carMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "myCars")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyCar {

    @Id
    @Column(name = "car_id")
    private long id;
    private String brand;
    private String model;
    private String color;
    private int salePrice;
    private int year;
    private int kilometer;


}
