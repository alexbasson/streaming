package com.condconv.streaming.children;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
class Child {
    private String id;
    private String name;
    private boolean muggle;
    private String email;
    private Address address;
    private String phone;
    private List<String> siblings;
}
