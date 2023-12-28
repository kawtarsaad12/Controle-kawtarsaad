package com.example.Controle.service;

import com.example.Controle.dao.entities.Book;
import com.example.Controle.dao.repositories.BookRepository;
import com.example.Controle.service.dtos.BookDTO;
import com.example.Controle.service.dtos.BookDtoInput;
import com.example.Controle.service.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class BookManagerAction {
   @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDTO getBookByTitle(String titre) {
        return bookMapper.fromBookToBookDto(bookRepository.findByTitle(titre));
    }

    @Override
    public BookDTO findByPublisherAndPrice(String publisher,Float price) {
        return bookMapper.fromBookToBookDto(bookRepository.findByPublisherandPrice(publisher,price));
    }

    @Override
    public BookDTO save(BookDtoInput bookDTOInput) {
        Book book = bookMapper.fromBookDtoInputToBook(bookDTOInput);
        book = bookRepository.save(book);
        return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public BookDTO delete(Optional<Book> id) {
        return bookMapper.fromBookToBookDto(bookRepository.delete(bookRepository.findById(id)));
    }

}
