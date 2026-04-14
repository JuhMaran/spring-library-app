package com.juhmaran.library.controller;

import com.juhmaran.library.service.PublisherService;
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
public class PublisherController {

  private final PublisherService publisherService;

  public PublisherController(PublisherService publisherService) {
    this.publisherService = publisherService;
  }

  @GetMapping("/publishers")
  public String getPublishers(Model model) {
    model.addAttribute("publishers", publisherService.findAll());
    return "publishers";
  }

}
