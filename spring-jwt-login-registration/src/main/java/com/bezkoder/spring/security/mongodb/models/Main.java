package com.bezkoder.spring.security.mongodb.models;

public class Main {

    public static void main(String[] args) {
        int myArray[] = { 4, -3, 10, 2, 5 };

        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { // find last unsorted array index
                                                                                                      
            for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++) {

                if (myArray[currentIndex] > myArray[currentIndex + 1]) {

                    int temp = myArray[currentIndex];
                    myArray[currentIndex] = myArray[currentIndex + 1]; // swap index values
                    myArray[currentIndex + 1] = temp; // swap index values
                }
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Sorted index " + i + " :" + myArray[i] + " "); // print new array
        }

    }

}
