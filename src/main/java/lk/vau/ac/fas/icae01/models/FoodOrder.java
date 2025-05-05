package lk.vau.ac.fas.icae01.models;


import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FoodOrder {
    @Id
    private Long id;

    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    
}
