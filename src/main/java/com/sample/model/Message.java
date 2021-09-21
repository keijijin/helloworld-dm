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
    public static final int HELLO = 0;
    public static final int GOODBYE = 1;

    private int status;
    private String message;
}
