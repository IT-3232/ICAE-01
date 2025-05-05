package lk.vau.ac.fas.icae01.models;


import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DailyMenu {
    @Id
    private Long id;

    private LocalDate date;

   

   
}

