package com.juhmaran.library.service;

import com.juhmaran.library.domain.Publisher;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
public interface PublisherService {

  Iterable<Publisher> findAll();

}
