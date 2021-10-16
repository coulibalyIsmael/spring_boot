package org.moutain.rest.impl;

import lombok.extern.slf4j.Slf4j;
import org.moutain.dto.HelloWorldDto;
import org.moutain.rest.api.HelloWorldApi;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldApiController implements HelloWorldApi {

  @Override
  public ResponseEntity<HelloWorldDto> getHelloWorldMessage() {
    log.info("API - HELLO WORLD ");
    return ResponseEntity.ok(new HelloWorldDto("Hello world !!"));
  }
}
