package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class pr1 {
    public static void main(String[] args) {
        ex1();
    }
    /*
    1. Пусть дан произвольный список целых чисел,
    удалить из него четные числа (в языке уже есть что-то готовое для этого)
     */
    public static void ex1() {
        ArrayList<Integer> list= new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20) );
        }
        System.out.println(list);
        Stream <Integer>stre=list.stream();
        Stream <Integer> stream=stre.filter(num->num%2!=0);
        stream.forEach(element-> System.out.print(element+" "));
        System.out.println();
    }
}