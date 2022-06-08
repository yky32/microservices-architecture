package com.quinsic.userservice.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/callback")
@Slf4j
public class EmmaEndpoint {

    @GetMapping()
    public String test() {
        return "this is from EmmaEndpoint";
    }

    @PostMapping()
    public String callback(@RequestBody Object body) {
        return body.toString();
    }
}
