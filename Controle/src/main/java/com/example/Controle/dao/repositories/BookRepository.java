package com.example.Controle.dao.repositories;

import com.example.Controle.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByPublisherandPrice(String publisher, Float price);

    Book findByTitle(String titre);
}
