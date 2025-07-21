package com.xworkz.compare.runner;

import com.xworkz.compare.product.ProductDTO;

import java.util.*;

public class ProductRunner {
    public static void main(String[] args) {
     Comparator<ProductDTO> dtoComparable=(o1,o2)->Integer.compare(o1.getProductPrice(), o2.getProductPrice());

        ProductDTO productDTO1=new ProductDTO(100,"Shampoo");
        ProductDTO productDTO2=new ProductDTO(150,"Chocolate");
        ProductDTO productDTO3=new ProductDTO(130,"Conditioner");

        List<ProductDTO> list=new ArrayList<>();
        list.add(productDTO1);
        list.add(productDTO2);
        list.add(productDTO3);

        Collections.sort(list,dtoComparable);
        list.forEach(s-> System.out.println(s));














    }
}
