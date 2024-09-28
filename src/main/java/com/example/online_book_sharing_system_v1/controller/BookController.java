package com.example.online_book_sharing_system_v1.controller;

import com.example.online_book_sharing_system_v1.dto.BookDto;
import com.example.online_book_sharing_system_v1.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;


    @GetMapping("/bShare/books")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        List<BookDto> bookDtos = bookService.getAllBooks();
        return ResponseEntity.ok(bookDtos);
    }

    @PostMapping("/bShare/books")
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) {
        BookDto createdBook = bookService.createBook(bookDto);
        return ResponseEntity.ok(createdBook);
    }

    @GetMapping("/bShare/books/{id}")
    public ResponseEntity<Optional<BookDto>> getBookById(@PathVariable Long id) {
        Optional<BookDto> bookDto = bookService.getBookById(id);
        return ResponseEntity.ok(bookDto);
    }

    @PutMapping("/bShare/books/{id}")
    public ResponseEntity<BookDto> updateBook(
            @PathVariable Long id,
            @RequestBody BookDto bookDto) {
        Optional<BookDto> updatedBook = bookService.updateBook(id, bookDto);
        return new ResponseEntity<>(updatedBook.orElse(null), HttpStatus.OK);
    }

    @DeleteMapping("/bShare/books/{id}")
    public ResponseEntity<BookDto> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
