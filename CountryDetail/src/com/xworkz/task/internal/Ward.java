package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Ward {

    private int wardNumber;
    private String wardName;
    private int population;
    private String councillorName;

}