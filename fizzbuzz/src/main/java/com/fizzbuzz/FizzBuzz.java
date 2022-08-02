package com.fizzbuzz;

/**
 * Hello world!
 *
 */
public class FizzBuzz 
{
    public static String fizzBuzz(int in)
    {
        if(in % 3 == 0)
            if(in % 5 == 0)
                return "fizzbuzz";
            else
                return "fizz";

        if(in % 5 == 0)
            return "buzz";

        return String.valueOf(in);
    }
}
