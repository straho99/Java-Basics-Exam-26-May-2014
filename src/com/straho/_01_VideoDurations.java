package com.straho;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_VideoDurations {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        ArrayList<String> input = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (line.compareTo("End") != 0) {
            input.add(line);
            line = scanner.nextLine();
        }

        for (String time : input) {
            String[] tokens = time.split(":");
            hours += Integer.parseInt(tokens[0]);
            minutes += Integer.parseInt(tokens[1]);
        }

        int minutesToHours = minutes / 60;
        minutes = minutes % 60;
        hours += minutesToHours;
        System.out.printf("%1d:%02d", hours, minutes);
    }

}
