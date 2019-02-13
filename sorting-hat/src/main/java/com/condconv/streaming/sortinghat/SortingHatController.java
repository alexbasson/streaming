package com.condconv.streaming.sortinghat;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SortingHatController {

    private final SortingHat sortingHat;

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/streaming/students", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Student> getStreamingStudents() {
        return sortingHat.sortedStudents();
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping(value = "/blocking/students", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<Student> getBlockingStudents() {
        return sortingHat.sortedStudents();
    }

}
