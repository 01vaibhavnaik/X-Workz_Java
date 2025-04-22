package com.xworkz.external;

import com.xworkz.internal.CompressionAlgorithm;

public class RarCompressor {
    private CompressionAlgorithm compressionAlgorithm;

    public RarCompressor(CompressionAlgorithm compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public void compress() {
        if (compressionAlgorithm != null) {
            compressionAlgorithm.compress();
        } else {
            System.err.println("Null");
        }
    }
}
