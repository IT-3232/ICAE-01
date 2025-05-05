package lk.vau.ac.fas.icae01.models;

import jakarta.persistence.*;


@Entity
public class Employee extends Person {
    private String jobPosition; 
}
