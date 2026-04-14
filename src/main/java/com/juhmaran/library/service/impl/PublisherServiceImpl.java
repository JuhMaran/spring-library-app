package com.juhmaran.library.service.impl;

import com.juhmaran.library.domain.Publisher;
import com.juhmaran.library.repository.PublisherRepository;
import com.juhmaran.library.service.PublisherService;
import org.springframework.stereotype.Service;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
@Service
public class PublisherServiceImpl implements PublisherService {

  private final PublisherRepository publisherRepository;

  public PublisherServiceImpl(PublisherRepository publisherRepository) {
    this.publisherRepository = publisherRepository;
  }

  @Override
  public Iterable<Publisher> findAll() {
    return publisherRepository.findAll();
  }

}
