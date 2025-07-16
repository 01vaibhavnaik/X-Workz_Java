package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PrimeMinister {
    private String primeMinistername;
    private String termStart;
    private String politicalParty;
    private double approvalRating;
    private Constituency constituency;
}
