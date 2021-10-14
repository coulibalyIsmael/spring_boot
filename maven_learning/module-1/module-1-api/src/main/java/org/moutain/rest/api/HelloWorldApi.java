package org.moutain.rest.api;

import org.moutain.dto.HelloWorldDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HelloWorldApi {

    @RequestMapping(
            path = "/hello-world",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<HelloWorldDto> getHelloWorldMessage();
}
