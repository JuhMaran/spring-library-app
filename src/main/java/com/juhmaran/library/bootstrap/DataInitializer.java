package com.juhmaran.library.bootstrap;

import com.juhmaran.library.domain.Author;
import com.juhmaran.library.domain.Book;
import com.juhmaran.library.domain.Publisher;
import com.juhmaran.library.repository.AuthorRepository;
import com.juhmaran.library.repository.BookRepository;
import com.juhmaran.library.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
@Component
public class DataInitializer implements CommandLineRunner {

  private final BookRepository bookRepository;
  private final AuthorRepository authorRepository;
  private final PublisherRepository publisherRepository;

  public DataInitializer(BookRepository bookRepository,
                         AuthorRepository authorRepository,
                         PublisherRepository publisherRepository) {
    this.bookRepository = bookRepository;
    this.authorRepository = authorRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    Publisher publisher = new Publisher();
    publisherRepository.save(publisher);

    Author author = new Author();
    author.setFirstName("Eric");
    author.setLastName("Evans");

    Book book = new Book();
    book.setTitle("Domain Driven Design");
    book.setIsbn("123456789");

    author.getBooks().add(book);
    book.getAuthors().add(author);

    book.setPublisher(publisher);
    publisher.getBooks().add(book);

    authorRepository.save(author);
    bookRepository.save(book);
    publisherRepository.save(publisher);

  }
}
