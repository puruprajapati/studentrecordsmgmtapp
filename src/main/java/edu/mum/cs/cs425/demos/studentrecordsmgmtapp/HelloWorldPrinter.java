package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class HelloWorldPrinter {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,5,7,10,15,13,16,21,35};

    printHelloWorld(numbers);
  }

  public static void printHelloWorld(int[] numbers) {
    for (int number : numbers) {
      if (number % 5 == 0 && number % 7 == 0) {
        System.out.println("HelloWorld");
      } else if (number % 5 == 0) {
        System.out.println("Hello");
      } else if (number % 7 == 0) {
        System.out.println("World");
      }
    }
  }
}
