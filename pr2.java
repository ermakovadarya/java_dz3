package org.example;

import java.util.ArrayList;
import java.util.Random;

public class pr2 {
    public static void main(String[] args) {
        ex2();
    }
    /*
    2. Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */
    public static void ex2() {
        ArrayList<Integer> list= new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20) );
        }
        System.out.println(list);
        int min= list.get(0);
        int max= list.get(0);
        int mid=0;
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<min){
                min= list.get(i);
            }
            if (list.get(i)>max){
                max= list.get(i);
            }
            sum+= list.get(i);
        }
        mid=sum/ list.size();
        System.out.println("min->"+min);
        System.out.println("max->"+max);
        System.out.println("mid->"+mid);
    }
}
