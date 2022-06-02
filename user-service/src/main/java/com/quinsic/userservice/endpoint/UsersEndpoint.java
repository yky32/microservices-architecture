package com.quinsic.userservice.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UsersEndpoint {

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id) {
        log.info("getUser {}", id);
        return "this is from users.";
    }
}
