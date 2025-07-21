package com.xworkz.compare.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Data

public class ProductDTO  {
    private int productPrice;
    private String productName;

}
