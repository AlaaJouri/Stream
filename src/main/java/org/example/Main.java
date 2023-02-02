package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] zahlen = new int []{9,1,5,8,99,3};
       // Arrays.sort(zahlen);

        int [] sorted =Arrays.stream(zahlen).sorted().toArray();
        int sum =Arrays.stream(zahlen).sum();
        int product=Arrays.stream(zahlen).reduce(1,(a,b)->a*b);
        System.out.println(Arrays.toString(sorted));
        System.out.println(sum);
        System.out.println(product);
    }
}