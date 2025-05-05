package lk.vau.ac.fas.icae01.models;


import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodOrder {
    @Id
    private Long id;

    private LocalDate orderDate;

  

    
}
