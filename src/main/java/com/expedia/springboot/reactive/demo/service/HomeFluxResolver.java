package com.expedia.springboot.reactive.demo.service;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HomeFluxResolver {

    private StringBuilder greeting = new StringBuilder();

    public Mono<String> getMonoGreeting() {
        Mono<String> s = Mono.just("Hola que tal?")
                .log();

        return s;
    }

    public Flux<String> getMonoGreetings() {
        Flux<String> f = Flux.just("Irving","Erick","Jez")
                .log();
        return f;
    }
}
