package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен, чтобы заполнить список А");
        String name1a = scanner.next();
        String name2a = scanner.next();
        String name3a = scanner.next();
        String name4a = scanner.next();
        String name5a = scanner.next();

        ArrayList<String> listA = new ArrayList<>();
        listA.add(0, name1a);
        listA.add(1, name2a);
        listA.add(2, name3a);
        listA.add(3, name4a);
        listA.add(4, name5a);
        System.out.println("Список А: " + listA);

        System.out.println("Введите 5 имен, чтобы заполнить список Б");
        String name1b = scanner.next();
        String name2b = scanner.next();
        String name3b = scanner.next();
        String name4b = scanner.next();
        String name5b = scanner.next();

        ArrayList<String> listB = new ArrayList<>();
        listB.add(0, name1b);
        listB.add(1, name2b);
        listB.add(2, name3b);
        listB.add(3, name4b);
        listB.add(4, name5b);
        System.out.println("Список B: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.add(0,name1a);
        listC.add(1,name5b);
        listC.add(2,name2a);
        listC.add(3,name4b);
        listC.add(4,name3a);
        listC.add(5,name3b);
        listC.add(6,name4a);
        listC.add(7,name2b);
        listC.add(8,name5a);
        listC.add(9,name1b);
        System.out.println("Список C: " + listC);
        Collections.sort(listC);
        System.out.println("Список C: " + listC);
    }
}
