package com.example.online_book_sharing_system_v1.service;

import com.example.online_book_sharing_system_v1.dto.BookDto;
import com.example.online_book_sharing_system_v1.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {
    List<BookDto> getAllBooks();
    BookDto createBook(BookDto bookDto);
    Optional<BookDto> updateBook(Long bookId,BookDto bookDto);
    void deleteBook(Long bookId);
    Optional<BookDto> getBookById(Long bookId);
}
