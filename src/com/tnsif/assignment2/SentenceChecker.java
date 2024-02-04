package com.assignment2;

import java.util.Scanner;

class SentenceChecker1 {
    private String sentence;

    public SentenceChecker1(String sentence) {
        this.sentence = sentence;
    }

    public void checkWord(String word) {
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}

public class SentenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        SentenceChecker1 sentenceChecker = new SentenceChecker1(sentence);
        sentenceChecker.checkWord(word);

        scanner.close();
    }
}
