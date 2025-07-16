package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString

public class Inspector {
    private String inspectorName;
    private String department;
    private int yearsOfService;
    private String emailAddress;
    private List<Experience> experiences;
}
