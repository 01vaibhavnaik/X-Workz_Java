package com.xworkz.internal;

public class LocalStorage implements StorageService {


    @Override
    public void storeData() {
        System.out.println("Storing data in local storage");
    }
}
