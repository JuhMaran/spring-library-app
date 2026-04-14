package com.juhmaran.library.service;

import com.juhmaran.library.domain.Author;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
public interface AuthorService {

  Iterable<Author> findAll();

}
