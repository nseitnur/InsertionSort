package com.company;

public class ArraySort {
    private Person[] a;
    private int n;

    public ArraySort(int max){
         a = new Person[max];
         n=0;
    }

    public void insert(String lastname,String name,int age){
        a[n]= new Person(lastname,name,age);
        n++;
    }
    public void display(){
        for(int i=0;i<n;i++){
            a[i].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort() {
        int i, j;

        for (i=1;i<n;i++){
            Person curr = a[i];
            j=i-1;

            while(j>=0&&a[j].getLastName().compareTo(curr.getLastName())>0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
    }
}
