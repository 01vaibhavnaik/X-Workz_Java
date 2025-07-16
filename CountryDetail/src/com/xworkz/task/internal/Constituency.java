package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Constituency {
    private String constituencyId;
    private String constituencyName;
    private int numberOfWards;
    private String representative;
    private Ward ward;
}
