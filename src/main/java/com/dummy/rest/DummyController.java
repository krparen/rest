package com.dummy.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
public class DummyController {

  @RequestMapping
  public String dummyEndpoint() {
    return "Hello from dummy endpoint";
  }
}
