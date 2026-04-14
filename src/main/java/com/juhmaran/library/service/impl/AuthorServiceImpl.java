package com.juhmaran.library.service.impl;

import com.juhmaran.library.domain.Author;
import com.juhmaran.library.repository.AuthorRepository;
import com.juhmaran.library.service.AuthorService;
import org.springframework.stereotype.Service;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
@Service
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;

  public AuthorServiceImpl(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  @Override
  public Iterable<Author> findAll() {
    return authorRepository.findAll();
  }

}
