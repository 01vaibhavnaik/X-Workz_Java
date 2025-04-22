package com.xworkz.external;

import com.xworkz.internal.SearchEngine;

public class BingSearch {
    private SearchEngine searchEngine;

    public BingSearch(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    public void search() {
        if (searchEngine != null) {
            searchEngine.search();
        } else {
            System.err.println("Null");
        }
    }
}
