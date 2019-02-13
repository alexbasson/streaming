package com.condconv.streaming.children;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.Random;

@Component
class ChildrenRepository {

    private static final Flux<Child> children;
    static {
        Child[] childrenArray = new Child[RandomGenerator.NUMBER_OF_CHILDREN];
        for (int i = 0; i < childrenArray.length; i++) {
            childrenArray[i] = RandomGenerator.getRandomChild(i);
        }
        children = Flux.fromArray(childrenArray);
    }

    Flux<Child> streamAll() {
        return children;
    }

}
