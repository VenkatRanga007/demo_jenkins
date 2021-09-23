package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {
  
  @GetMapping("/demo/{name}")
  private String demo(@PathVariable String name) {
    
    return "Test Application, Hello "+name;
  }

}