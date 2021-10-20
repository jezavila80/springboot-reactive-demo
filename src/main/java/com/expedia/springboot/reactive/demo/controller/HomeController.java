package com.expedia.springboot.reactive.demo.controller;

import com.expedia.springboot.reactive.demo.service.HomeFluxResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {

    @Autowired
    private HomeFluxResolver resolver;

    @GetMapping(path="/getgreeting")
    public Mono<String> getGreeting() {
        return resolver.getMonoGreeting();
    }

    @GetMapping(path="/greetings")
    public Flux<String> getGreetings() {
        return resolver.getMonoGreetings();
    }

}
