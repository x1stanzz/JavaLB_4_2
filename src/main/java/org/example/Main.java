package org.example;

public class Main {
    public static void main(String[] args){
        /*
        todo:
        Create a decoder
        Encoding methods:
        - Vowel replacement: all vowels(a,e,i,o,u) are replaced by numbers: a=1, e=2, i=3, o=4, u=5. t2st3ng = testing
                - Consonant replacement: all consonant are replaced by the next consonant in the sequence. uftujoh = testing
        Plan:
        1. Create a class named Decoder with static methods for each type of encoding
        2. Use regular expressions to determine which encoding method was applied to each word
        3. Use StringBuilder for efficient string manipulations
        4. Create a main function to demonstrate decoder with examples of encrypted messages
    * */
        String encodedMessage1 = "t2st3ng";
        String encodedMessage2 = "uftujoh";

        String decodedMessage1 = Decoder.decodeMessage(encodedMessage1);
        String decodedMessage2 = Decoder.decodeMessage(encodedMessage2);

        System.out.println("Decoded message 1: " + decodedMessage1);
        System.out.println("Decoded message 2: " + decodedMessage2);
    }
}