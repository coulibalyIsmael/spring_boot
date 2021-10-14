package org.moutain.rest.impl;

import org.moutain.dto.HelloWorldDto;
import org.moutain.rest.api.HelloWorldApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApiController implements HelloWorldApi {

    @Override public ResponseEntity<HelloWorldDto> getHelloWorldMessage() {
        return ResponseEntity.ok(new HelloWorldDto("Hello world !!"));
    }
}
