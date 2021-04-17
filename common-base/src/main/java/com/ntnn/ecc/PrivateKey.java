package com.ntnn.ecc;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PrivateKey {
    private EllipticCurve c;
    private BigInteger k;

    public PrivateKey(EllipticCurve c, BigInteger k) {
        this.c = c;
        this.k = k;
    }

    public PrivateKey(String pathFile) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathFile), StandardCharsets.UTF_8);
            BigInteger a = new BigInteger(lines.get(0), 16);
            BigInteger b = new BigInteger(lines.get(1), 16);
            BigInteger p = new BigInteger(lines.get(2), 16);
            BigInteger g1 = new BigInteger(lines.get(3), 16);
            BigInteger g2 = new BigInteger(lines.get(4), 16);
            BigInteger k = new BigInteger(lines.get(5), 16);
            EllipticCurve eC = new EllipticCurve(a, b, p, new Point(g1, g2));
            this.c = eC;
            this.k = k;
        } catch (Exception e) {

        }
    }

    public void setCurve(EllipticCurve c) {
        this.c = c;
    }

    public EllipticCurve getCurve() {
        return c;
    }

    public void setKey(BigInteger k) {
        this.k = k;
    }

    public BigInteger getKey() {
        return k;
    }

    public Point getBasePoint() {
        return c.getBasePoint();
    }
}
