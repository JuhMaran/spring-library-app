package com.juhmaran.library.controller;

import com.juhmaran.library.service.AuthorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-library-app
 *
 * @author Juliane Maran
 * @since 13/04/2026
 */
@RestController
public class AuthorController {

  private final AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping("/authors")
  public String getAuthors(Model model) {
    model.addAttribute("authors", authorService.findAll());
    return "authors";
  }

}
