package com.company;



public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        Object[] integers = arrayStack.toArray();
        for(Object integer : integers){
            System.out.println(integer);
        }

        Integer pop = arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();

        System.out.println(pop);


        System.out.println("Size: " + arrayStack.size());


    }
}
