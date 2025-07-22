package com.xworkz.compare.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class TrainDto {
    private String trainName;
    private String trainSource;
    private Integer trainPrice;
}
