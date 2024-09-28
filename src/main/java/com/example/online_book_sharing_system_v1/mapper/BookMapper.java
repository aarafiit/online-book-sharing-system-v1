package com.example.online_book_sharing_system_v1.mapper;

import com.example.online_book_sharing_system_v1.dto.BookDto;
import com.example.online_book_sharing_system_v1.entity.Book;


public class BookMapper {
    public static BookDto toBookDto(Book book) {
        if (book == null) {
            return null;
        }
        return new BookDto(
                book.getId(),
                book.getTitle(),
                book.getDescription(),
                book.getAuthor(),
                book.getPublisher(),
                book.getOriginalPrice(),
                book.getImage(),
                book.getCategoryId(),
                book.getOwnerId(),
                book.getBorrowerId(),
                book.getStatus()
        );
    }

    public static Book toBook(BookDto bookDto) {
        return new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getDescription(),
                bookDto.getAuthor(),
                bookDto.getPublisher(),
                bookDto.getOriginalPrice(),
                bookDto.getImage(),
                bookDto.getCategoryId(),
                bookDto.getOwnerId(),
                bookDto.getBorrowerId(),
                bookDto.getStatus()
        );
    }
}
