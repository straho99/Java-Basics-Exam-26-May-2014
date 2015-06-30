package com.straho;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_LargestThreeRectangles {
    public static void main(String[] args) {
        int largestArea = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] rectanglePieces = input.split("[\\[\\]\\sx]+");
        ArrayList<Integer> sides = new ArrayList<Integer>();
        for (int i = 0; i < rectanglePieces.length; i++) {
            if (rectanglePieces[i].length() > 0) {
                sides.add(Integer.parseInt(rectanglePieces[i]));
            }
        }
//        System.out.println(sides.toString());
        if (sides.size() == 6) {
            System.out.println(calculateArea(sides.get(0), sides.get(1), sides.get(2), sides.get(3), sides.get(4), sides.get(5)));
            return;
        }
        for (int i = 0; i <= sides.size() - 6; i += 2) {
            int currentArea = calculateArea(sides.get(i), sides.get(i+1), sides.get(i+2), sides.get(i+3), sides.get(i+4), sides.get(i+5));
            if (largestArea < currentArea) {
                largestArea = currentArea;
            }
        }

        System.out.println(largestArea);
    }

    public static int calculateArea(int a1, int b1, int a2, int b2, int a3, int b3) {
        return a1 * b1 + a2 * b2 + a3 * b3;
    }
}
