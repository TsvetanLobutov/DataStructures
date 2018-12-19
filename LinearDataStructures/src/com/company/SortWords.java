package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> words = new ArrayList<>();

        while (!in.hasNextInt()){
            words.add(in.nextLine());
        }

       // in.close();

        System.out.println(words);

        Collections.sort(words);

//

        for(String counter: words){
            System.out.print(counter + " ");
        }



    }


}
