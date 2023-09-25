package isabyndr.carMarket.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brand", nullable = false,length = 45)
    private String brand;

    @Column(name = "model", nullable = false, length = 45)
    private String model;

    @Column(name = "color", nullable = false,length = 45)
    private String color;

   @Column(name = "sale_price", nullable = false,length = 15)
    private int salePrice;

   @Column(name = "year" , nullable = false, length = 10)
    private int year;

    @Column(name = "kilometer", nullable = false, length = 10)
    private int kilometer;

}
