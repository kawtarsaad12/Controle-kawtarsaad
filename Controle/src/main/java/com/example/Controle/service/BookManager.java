package com.example.Controle.service;

import com.example.Controle.service.dtos.BookDTO;

public interface BookManager {
    public BookDTO getBookByTitle(String titre);
    public BookDTO saveBook(BookDTO bookDTO);

   public BookDTO getBookByPublisherandPrice(String publisher,Float price);
    public BookDTO deleteBook(BookDTO bookDTO);
}


