package com.ntnn.utils;

import java.io.InputStream;

public class FileUtils {
    public static InputStream getFileResource(String name) {
        InputStream inputStream = FileUtils.class.getClassLoader().getResourceAsStream(name);
        return inputStream;
    }

}
