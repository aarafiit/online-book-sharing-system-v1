package com.example.online_book_sharing_system_v1.service;

import com.example.online_book_sharing_system_v1.dto.BookDto;
import com.example.online_book_sharing_system_v1.entity.Book;
import com.example.online_book_sharing_system_v1.exception.BookNotFoundException;
import com.example.online_book_sharing_system_v1.mapper.BookMapper;
import com.example.online_book_sharing_system_v1.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
                .map(BookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book createdBook = bookRepository.save(BookMapper.toBook(bookDto));
        return BookMapper.toBookDto(createdBook);
    }

    @Override
    public Optional<BookDto> updateBook(Long bookId,BookDto bookDto) {
        return bookRepository.findById(bookId)
                .map(book -> {
                    book.setAuthor(bookDto.getAuthor());
                    book.setTitle(bookDto.getTitle());
                    book.setPublisher(bookDto.getPublisher());
                    book.setImage(bookDto.getImage());
                    book.setBorrowerId(bookDto.getBorrowerId());
                    book.setCategoryId(bookDto.getCategoryId());
                    book.setOriginalPrice(bookDto.getOriginalPrice());
                    book.setOwnerId(bookDto.getOwnerId());
                    Book updatedBook = bookRepository.save(book);
                    return Optional.of(BookMapper.toBookDto(updatedBook));
                }).orElseThrow(() -> new BookNotFoundException("Book not found with id: " + bookId));

    }

    @Override
    public void deleteBook(Long bookId) {
        if(bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
        }
        else{
            throw new BookNotFoundException("Book not found with id: " + bookId);
        }
    }

    @Override
    public Optional<BookDto> getBookById(Long bookId) {
        return bookRepository.findById(bookId).map(
                BookMapper::toBookDto
        );
    }
}
