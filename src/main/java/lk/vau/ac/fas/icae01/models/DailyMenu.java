package lk.vau.ac.fas.icae01.models;


import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
    @Id
    private Long id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "canteen_id")
    private Canteen canteen;

   
}

