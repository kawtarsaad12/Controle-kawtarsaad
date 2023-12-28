package com.example.Controle.web;

import com.example.Controle.dao.entities.Book;
import com.example.Controle.service.BookManager;
import com.example.Controle.service.dtos.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookGraphQLController {

        @Autowired
        private BookManager bookManager;
        private Object BookDTOInput;

        @QueryMapping
        public BookManager getBookByTitle(@Argument String titre){

            return bookManager.getBookByTitle(titre);
        }
        @QueryMapping
        public BookDTO getByPublisherandPrice(@Argument String publisher, @Argument Float price){
            return bookManager.getBookByPublisherandPrice(publisher, price);
        }
        @MutationMapping
        public BookDTO saveBook(@Argument BookDTO bookDTO){
            return bookManager.saveBook(BookDTO);

        }
