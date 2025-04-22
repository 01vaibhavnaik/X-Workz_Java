package com.xworkz.external;

import com.xworkz.internal.LocalStorage;
import com.xworkz.internal.StorageService;

public class CloudStorage {
    private StorageService storageService;

    public CloudStorage(StorageService storageService) {
        this.storageService = storageService;
    }
    public void save() {
        if (storageService != null) {
            storageService.storeData();
        } else {
            System.out.println("No local storage available");
        }
    }
}
