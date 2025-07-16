package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Information {
    private int municipalityCode;
    private String areaCovered;
    private String website;
    private String contactNumber;
    private Mayor mayor;

}
