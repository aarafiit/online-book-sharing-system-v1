package com.example.online_book_sharing_system_v1.repository;

import com.example.online_book_sharing_system_v1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
