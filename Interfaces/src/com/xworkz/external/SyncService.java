package com.xworkz.external;

import com.xworkz.internal.Watcher;

public class SyncService {
    private Watcher watcher;

    public SyncService(Watcher watcher) {
        this.watcher = watcher;
    }

    public void sync() {
        if(watcher != null) {
            watcher.watch();
        } else {
            System.out.println("No watcher provided.");
        }
    }
}
