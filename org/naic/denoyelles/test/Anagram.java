package org.naic.denoyelles.test;

import java.util.Arrays;

public class Anagram {

    public Anagram(String... strings) {

        if(strings.length < 2) {
            throw new InvalidArgumentException("Anagram class must have two arguments.");
        } else if(strings.length > 2) {
            throw new IllegalArgumentException("There only needs to be two arguments.");
        } else {

            //Convert words to char array and ignore case.
            char[] word1 = strings[0].toLowerCase().toCharArray();
            char[] word2 = strings[1].toLowerCase().toCharArray();

            //Sort the array so we can compare the two with Arrays.equals properly for this purpose.
            Arrays.sort(word1);
            Arrays.sort(word2);

            if(Arrays.equals(word1, word2)) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }

    private class InvalidArgumentException extends RuntimeException {

        private InvalidArgumentException(String message) {
            super(message);
        }
    }
}
