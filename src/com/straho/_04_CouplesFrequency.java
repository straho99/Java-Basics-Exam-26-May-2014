package com.straho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _04_CouplesFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
        ArrayList<String> couples = new ArrayList<String>();
        for (int i = 0; i < numbers.length - 1; i++) {
            String couple = "" + numbers[i] + " " + numbers[i + 1];
            if (!frequencies.containsKey(couple)) {
                frequencies.put(couple, 1);
                couples.add(couple);
            } else {
                frequencies.put(couple, frequencies.get(couple) + 1);
            }
        }
        for (int i = 0; i < couples.size(); i++) {
            double frequency = (double) frequencies.get(couples.get(i)) / (double) (numbers.length - 1);
            frequency *= 100;
            System.out.printf("%1s -> %2$.2f%%\n", couples.get(i), frequency);
        }
    }
}
