package com.news.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name")
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category_id")
    private Set<News> news;
}
