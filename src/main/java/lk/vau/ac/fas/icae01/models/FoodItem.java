package lk.vau.ac.fas.icae01.models;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class FoodItem {
    @Id

    private Long id;

    private String name;
    private double price;
    private double weight;

    

   
}

