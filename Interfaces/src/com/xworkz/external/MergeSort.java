package com.xworkz.external;

import com.xworkz.internal.SortingAlgorithm;

public class MergeSort {
    private SortingAlgorithm sortingAlgorithm;

    public MergeSort(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort() {
        if (sortingAlgorithm != null) {
            sortingAlgorithm.sort();
        } else {
            System.err.println("Null");
        }
    }
}
