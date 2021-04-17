package com.ntnn.ecdsa;

public class GenerateKeys{

    public static void main(String[] args){
        // Generate Keys
        PrivateKey privateKey = new PrivateKey();
        PublicKey publicKey = privateKey.publicKey();

        System.out.println(privateKey.toPem());

        System.out.println(publicKey.toPem());

        String message = "Testing message";
        // Generate Signature
        Signature signature = Ecdsa.sign(message, privateKey);

        // Verify if signature is valid
        boolean verified = Ecdsa.verify(message, signature, publicKey) ;

        // Return the signature verification status
        System.out.println("Verified: " + verified);

    }
}
