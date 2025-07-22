package com.xworkz.compare.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
@Getter
public class TrainDto {
    private int trainNo;
    private String trainName;
    private String trainSource;
    private Integer trainPrice;
    private LocalDateTime localDateTime;
}
