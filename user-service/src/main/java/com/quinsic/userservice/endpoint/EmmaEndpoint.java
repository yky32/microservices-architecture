package com.quinsic.userservice.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callback")
@Slf4j
public class EmmaEndpoint {

    @GetMapping()
    public String test() {
        return "this is from EmmaEndpoint";
    }

}
