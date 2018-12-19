package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> words = new ArrayList<>().;



        while (!in.hasNextLine()){
            words.add(in.nextLine());
        }

       //  in.close();
        System.out.println(words);
        Collections.sort(words);

//

        for(String counter: words){
            System.out.print(counter + " ");
        }



    }





}
