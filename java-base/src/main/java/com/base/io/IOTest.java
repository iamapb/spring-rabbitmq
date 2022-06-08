package com.base.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest {
    FileInputStream file;

    {
        try {
            file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void close(AutoCloseable... autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        for (AutoCloseable a : autoCloseable) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
