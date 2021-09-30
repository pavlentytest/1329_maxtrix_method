package ru.samsung.itschool.mdev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static void doPrint(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        Car tesla = new Car();

        int[] x;
        Scanner scanner = new Scanner(System.in);
        x = new int[scanner.nextInt()];
        Random rand = new Random();
        for(int i=0;i<x.length;i++) {
          //  x[i] = rand.nextInt(100);
            x[i] = (int)(Math.random()*100);
        }
        doPrint(x);
    }

}
