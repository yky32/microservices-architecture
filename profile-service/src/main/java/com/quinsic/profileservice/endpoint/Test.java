package com.quinsic.profileservice.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class Test {

    @GetMapping("/")
    public String test() {
        return "this is from ProfileServiceApplication";
    }

}
