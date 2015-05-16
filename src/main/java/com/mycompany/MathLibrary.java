package com.mycompany;

/**
 * Created by nirmal on 5/16/2015.
 */
public class MathLibrary {

    public static final boolean NOT_PRIME = false;
    public static final boolean PRIME = true;

    boolean isPrime(int number) {
        if (number < 2)
            return NOT_PRIME;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return NOT_PRIME;
        }
        return PRIME;
    }

    Long factorial(int number) {
        if (number < 0)
            throw new Error("Cannot compute factorial for negative number");
        else if (number == 0) //factorial of 0 is 1
            return 1L;
        else
            return 1L * number * factorial(number - 1);
    }
}
