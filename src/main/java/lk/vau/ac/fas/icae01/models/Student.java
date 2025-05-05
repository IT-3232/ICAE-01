package lk.vau.ac.fas.icae01.models;


import jakarta.persistence.Entity; 

@Entity
public class Student extends Person {
    private String academicDegree;

    /*@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders;*/

    // Getters and Setters
}

