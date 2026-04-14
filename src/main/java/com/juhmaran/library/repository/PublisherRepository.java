package com.juhmaran.library.repository;

import com.juhmaran.library.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
