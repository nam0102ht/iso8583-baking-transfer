package com.ntnn.argon2;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Agron2Utils {
    public static String hash(String plainText) {
        Argon2 argon2 = Argon2Factory.create();
        String hash = "";
        try {
            // iterations = 10
            // memory = 64m
            // parallelism = 1
            hash = argon2.hash(22, 65536, 1, plainText.toCharArray());

        } finally {
            // Wipe confidential data
            argon2.wipeArray(plainText.toCharArray());
        }
        return hash;
    }

    public static boolean verify(String hashText, String rawText) {
        Argon2 argon2 = Argon2Factory.create();
        if (argon2.verify(hashText, rawText.toCharArray())) {
            return true;
        }
        return false;
    }
}
