package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveOddOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }

        int count = 0;


        for (int i = 0; i < numbers.size(); i++) {
            count = 0;
            for (int j = 0; j < numbers.size(); j++) {

                if(numbers.get(i).equals(numbers.get(j))){


                    count ++;

                }

            }



            if((count % 2) != 0){
                for (int j = 0; j < numbers.size(); j++) {

                    if(numbers.get(i).equals(numbers.get(j))){
                        numbers.remove(j);
                    }

                }
            }




        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
