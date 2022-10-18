package com.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Attribute {
    HREF("href"),
    CLASS("class");

    private final String attributeName;
}
