package util;

import java.math.BigInteger;

public class Utils {

    public String concatenateWords(String a, String b) {
        return a.concat(b);
    }

    public BigInteger computeFactorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
