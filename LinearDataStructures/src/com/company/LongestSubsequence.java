package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }


        // List<Integer> subSeq = new ArrayList<>();
        int count = 1;
        int theNumber = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                 theNumber = numbers.get(i);
                 count = count + 1;

            }else {
                count = 1;
            }


        }


        while (count != 0){
            System.out.print(theNumber + " ");
            count--;
        }


    }
}
