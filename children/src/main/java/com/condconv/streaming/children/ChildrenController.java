package com.condconv.streaming.children;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChildrenController {

    private final ChildrenRepository childrenRepository;

    @GetMapping(value = "/children", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Child> getChildren() {
        return childrenRepository.streamAll();
    }

}
