package leetcodepractice;

import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        // Create a list to store the result
        List<String> result = new ArrayList<>();
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // If divisible by both 3 and 5, add "FizzBuzz"
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // If divisible by 3, add "Fizz"
                result.add("Fizz");
            } else if (i % 5 == 0) {
                // If divisible by 5, add "Buzz"
                result.add("Buzz");
            } else {
                // Otherwise, add the number as a string
                result.add(String.valueOf(i));
            }
        }

        // Return the list
        return result;
    }
}

