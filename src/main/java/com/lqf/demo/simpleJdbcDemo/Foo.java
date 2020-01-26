package com.lqf.demo.simpleJdbcDemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Foo {
    private Long id;
    private String bar;

    public Foo(Long id, String bar) {
        this.id = id;
        this.bar = bar;
    }
}
