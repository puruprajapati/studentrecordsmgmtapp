package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class SeconBiggestFinder {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {19, 9, 11, 0, 12};

    int secondLargest1 = findSecondBiggest(array1);
    int secondLargest2 = findSecondBiggest(array2);

    System.out.println("Second largest in array1: " + secondLargest1);
    System.out.println("Second largest in array2: " + secondLargest2);
  }

  public static int findSecondBiggest(int[] array) {
    if (array.length < 2) {
      throw new IllegalArgumentException("Array must have at least two elements.");
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : array) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    return secondLargest;
  }
}
