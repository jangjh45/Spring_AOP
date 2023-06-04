package com.example.aop.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class api {

  @GetMapping("/api/getTest")
  public void GetTest() {
    log.info("getTest 컨트롤러");
  }

}
