package com.example.online_book_sharing_system_v1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String author;

    private String publisher;

    private BigDecimal originalPrice;

   private String image;

   private Long categoryId;

   private Long ownerId;

   private Long borrowerId;

   private Long status;

}
