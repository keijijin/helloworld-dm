package com.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.kie.api.definition.type.ClassReactive;

@ClassReactive
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    public static final Integer HELLO = 0;
    public static final Integer GOODBYE = 1;

    private Integer status;
    private String message;
}
