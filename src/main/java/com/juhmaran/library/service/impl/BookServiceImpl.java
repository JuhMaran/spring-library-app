package com.juhmaran.library.service.impl;

import com.juhmaran.library.domain.Book;
import com.juhmaran.library.repository.BookRepository;
import com.juhmaran.library.service.BookService;
import org.springframework.stereotype.Service;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public Iterable<Book> findAll() {
    return bookRepository.findAll();
  }

}
