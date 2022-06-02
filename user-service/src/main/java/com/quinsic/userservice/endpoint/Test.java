package com.quinsic.userservice.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Test {

    @GetMapping("/test/as")
    public String testauth() {
        return "this is from auth server";
    }

}
