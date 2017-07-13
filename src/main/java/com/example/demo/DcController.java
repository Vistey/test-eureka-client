package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sai on 2017/7/13. this 0:18
 */

@RestController
public class DcController {

  @GetMapping("/dc")
  public String dc(){
    String services = "hello this is DcController";
    System.out.println(services);
    return services;
  }

}
