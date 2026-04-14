package com.juhmaran.library.service;

import com.juhmaran.library.domain.Book;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
public interface BookService {

  Iterable<Book> findAll();

}
