package com.example.Controle.service.mappers;

import com.example.Controle.dao.entities.Book;
import com.example.Controle.service.dtos.BookDTO;
import com.example.Controle.service.dtos.BookDtoInput;
import org.modelmapper.ModelMapper;

public class BookMapper {
    private final ModelMapper modelMapper=new ModelMapper();


    public Book fromBookDtoToBook(BookDTO bookDto) {
        return this.modelMapper.map(bookDto, Book.class);
    }

    public BookDTO fromBookToBookDto(Book book) {
        return this.modelMapper.map(book, BookDTO.class);
    }
    public BookDTO fromBookDtoInputToBookDTO(BookDtoInput bookDTOInput) {
        return this.modelMapper.map(bookDTOInput, BookDTO.class);
    }

    public BookDtoInput fromBookDtoToBookDTOInput(BookDTO bookDTO) {
        return this.modelMapper.map(bookDTO, BookDtoInput.class);
    }

    public Book fromBookDtoInputToBook(BookDtoInput bookDTOInput) {
        return this.modelMapper.map(bookDTOInput, Book.class);
    }
}
