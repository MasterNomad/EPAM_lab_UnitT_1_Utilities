package util;

import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    private Utils utils = new Utils();

    public UtilsTest() {
    }

    @Test(expected = NullPointerException.class)
    @SuppressWarnings("all")
    public void testConcatenateNulls() {
        String a = null;
        String b = null;
        utils.concatenateWords(a, b);
    }

    @Test
    public void testConcatenateEmptyStrings() {
        String a = "";
        String b = "";
        String expResult = "";
        String result = utils.concatenateWords(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testConcatenateNonLatin() {
        String a = "Нон";
        String b = "Латин";
        String expResult = "НонЛатин";
        String result = utils.concatenateWords(a, b);
        assertEquals(expResult, result);
    }

    @Ignore
    @Test
    public void testComputeFactorial() {
        long a = 145;
        BigInteger expResult = new BigInteger(
                "804792605747199194484902925779806277109997439007500616344745281047115412373646521410850481879839" +
                        "64922743929823029891501981310822165166365957244160940855691773914931590599281141186663578607" +
                        "5524601835815642793302504243200000000000000000000000000000000000"
        );
        BigInteger result = utils.computeFactorial(a);
        assertEquals(expResult, result);
    }

    @Test (timeout = 600)
    public void textComputeFactorialTimeout() {
        long a = (long) (Math.random() * 100000);
        utils.computeFactorial(a);

    }
}