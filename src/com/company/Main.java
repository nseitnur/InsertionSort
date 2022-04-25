package com.company;

public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySort arr;

        arr = new ArraySort(maxSize);

        arr.insert("Seitnur","Nursultan",16);
        arr.insert("Uzumaki","Naruto",16);
        arr.insert("Uchiha","Sasuke",19);
        arr.insert("Uchiha","Madaro",34);
        arr.insert("Namikadze","Minato",29);

        System.out.println("Before sorting");
        arr.display();
        arr.insertionSort();

        System.out.println("After Sorting");
        arr.display();

        }
}