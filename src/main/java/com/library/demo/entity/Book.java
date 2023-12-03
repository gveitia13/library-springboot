package com.library.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String title;
    private String author;
    private String description;
    private int copies;
    @Column(name = "copies_available")
    private int copiesAvaliable;
    private String category;
    private String img;
}
