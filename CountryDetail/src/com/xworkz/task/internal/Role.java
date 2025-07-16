package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString

public class Role {
    private String roleName;
    private String roleDescription;
    private double salary;
    private int experienceRequired;
    private List<Criteria> criteria;

}
