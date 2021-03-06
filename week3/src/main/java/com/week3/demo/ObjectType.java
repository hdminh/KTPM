package com.week3.demo;

import lombok.Getter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public enum ObjectType {
    PHAN_SO("tuSo,mauSo"),
    BOOK("isnb,title,authors,publisher");

    private final Set<String> strDefKeys;

  ObjectType(String str){
        strDefKeys = Arrays.stream(str.split(",")).collect(Collectors.toSet());
    }
}
