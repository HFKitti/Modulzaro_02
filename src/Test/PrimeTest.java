package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

   /* @Test
    void test_isPrime(){
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(25));


        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(2147483647));
    }*/

    @Test void test1_isPrime(){
        assertFalse(Prime.isPrime(0));
    }

    @Test void test2_isPrime(){
        assertFalse(Prime.isPrime(1));
    }

    @Test void test3_isPrime(){
        assertFalse(Prime.isPrime(4));
    }

    @Test void test4_isPrime(){
        assertFalse(Prime.isPrime(25));
    }

    @Test void test5_isPrime(){
        assertTrue(Prime.isPrime(2));
    }

    @Test void test6_isPrime(){
        assertTrue(Prime.isPrime(3));
    }

    @Test void test7_isPrime(){
        assertTrue(Prime.isPrime(11));
    }

    @Test void test8_isPrime(){
        assertTrue(Prime.isPrime(2147483647));
    }


}