package com.condconv.streaming.sortinghat;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder(toBuilder = true)
class Student {
    private String id;
    private String name;
    private boolean muggle;
    private House house;

    boolean isMagical() {
        return !muggle;
    }
}
