package com.example.j0709springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


  @GetMapping
  public String index(){
    return "";
  }
  @GetMapping("message")
  public String message(){
    return "Hello person";
  }
  @GetMapping("echo")
  public String echo(@RequestParam String input){
    return "Hello " + input;
  }

  @GetMapping("IsItFriday")
  public String isItFriday(){
    return "";
  }
}
