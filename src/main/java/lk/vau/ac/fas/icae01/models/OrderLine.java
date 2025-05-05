package lk.vau.ac.fas.icae01.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderLine {
    @Id
    private Long id;

    private int quantity;

   
}

