package com.example.yobel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Characters {
    
    @Id
    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;


}

