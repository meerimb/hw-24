package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
         Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.*/

        Random random1 = new Random();
        ArrayList<Integer> random = new ArrayList<>();
        LinkedList<Integer> random2 = new LinkedList<>();
        int[] random3 = new int[10];

        for (int i = 0; i <10 ; i++) {
            int runNum= random1.nextInt(2);
            random3[i]=runNum;
            random.add(runNum);
            random2.add(runNum);
        }
         Arrays.sort(random3);
        for (int r:random3
             ) {
            System.out.println(r);
        }
        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            random.add(random1.nextInt(2));
            System.out.println(random.get(i));
        }
        for (int i = 0; i < 10; i++) {
            random2.add(random1.nextInt(2));
            System.out.println(random2.get(i));
        }
//        Collections.sort(random);
//        System.out.println(random);

        arraylist(random);
        linkedlist(random2);
    }
    public static void arraylist(ArrayList<Integer> random) {
        Collections.sort(random);
        System.out.println(random);
    }
    public static void linkedlist(LinkedList<Integer> random2) {
        Collections.sort(random2);
        System.out.println(random2);
    }
}












