package com.xworkz.task2.internal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Minister {
    private String ministerName;
    private String phNumber;
    private List<Portfolio> portfolio;
}
