package com.ntnn.ecdsa;

import org.junit.Assert;
import org.junit.Test;

public class EcdsaTest {
    @Test
    public void testVerifyRightMessage() {
        PrivateKey privateKey = new PrivateKey();
        PublicKey publicKey = privateKey.publicKey();

        String message = "This is the right message";

        Signature signature = Ecdsa.sign(message, privateKey);
        Assert.assertTrue(Ecdsa.verify(message, signature, publicKey));
    }

    @Test
    public void testVerifyWrongMessage() {
        PrivateKey privateKey = new PrivateKey();
        PublicKey publicKey = privateKey.publicKey();

        String message1 = "This is the right message";
        String message2 = "This is the wrong message";

        Signature signature = Ecdsa.sign(message1, privateKey);

        Assert.assertFalse(Ecdsa.verify(message2, signature, publicKey));
    }
}
