package com.condconv.streaming.sortinghat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
class StudentRepository {

    Flux<Student> streamAll() {
        return WebClient.create("http://localhost:8090")
                .get()
                .uri("/api/children")
                .retrieve()
                .bodyToFlux(Student.class);
    }

}
