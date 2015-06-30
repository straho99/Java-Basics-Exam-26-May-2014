package com.straho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _02_PitagoreanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        HashMap<String, ArrayList<String>> results = new HashMap<String, ArrayList<String>>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = numbers[i];
            for (int j = 0; j < n; j++) {
                int b = numbers[j];
                for (int k = 0; k < n; k++) {
                    int c = numbers[k];
                    if (a * a + b * b == c * c) {
                        if (a <= b && !(results.containsKey(c + "*" + c) && results.get(c + "*" + c).contains(a + "*" + a) && results.get(c + "*" + c).contains(b + "*" + b))) {
                            ArrayList<String> newPair = new ArrayList<String>();
                            newPair.add(a + "*" + a);
                            newPair.add(b + "*" + b);
                            results.put(c + "*" + c, newPair);
                            System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d\n", a, b, c);
                            count++;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
