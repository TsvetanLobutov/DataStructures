package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountOfOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }

        Collections.sort(numbers);

      //  System.out.println(numbers);

        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            count = 0;
            for (int j = 0; j < numbers.size() ; j++) {

                if(numbers.get(i).equals(numbers.get(j))){
                    count++;
                }


            }


            System.out.println(numbers.get(i) + " -> " + count + " times");

        }


    }

}
