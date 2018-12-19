package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()){
            numbers.add(in.nextInt());
        }

        // System.out.println(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);

        }



        double average = (double) sum / numbers.size();
        System.out.print("Sum=" + sum + ";" + " ");
        System.out.printf("Average=" + "%.2f", average);


    }
}
