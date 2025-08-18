package com.bash.onetomanypractice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false, length = 50)
    private String name;
}
