package com.condconv.streaming.children;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class Address {
    String line;
    String city;
}
