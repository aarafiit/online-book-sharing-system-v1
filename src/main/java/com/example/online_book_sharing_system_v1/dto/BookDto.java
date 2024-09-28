package com.example.online_book_sharing_system_v1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;
    private String title;
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
