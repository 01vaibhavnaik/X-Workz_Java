package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Education {
        private String degreeName;
        private String institutionName;
        private University univercity;
}
