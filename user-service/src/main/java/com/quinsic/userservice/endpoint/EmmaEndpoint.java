package com.quinsic.userservice.endpoint;

import com.quinsic.userservice.entity.po.Emma;
import com.quinsic.userservice.repository.EmmaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("/callback")
@Slf4j
public class EmmaEndpoint {

    @Autowired
    private EmmaRepository emmaRepository;

    @GetMapping()
    public String test() {
        return "this is Endpoint for Emma's Callback";
    }

    @PostMapping()
    public String callback(@RequestBody Object context) {
        Emma emma = Emma.builder()
                .callbackContext(context)
                .callbackDatetime(Instant.now())
                .build();
        emma = emmaRepository.save(emma);
        return emma.toString();
    }
}
