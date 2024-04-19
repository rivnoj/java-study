package com.rivnoj.exception.error.test;

public class StackOverflowTest1 {
  public static void main(String[] args) {
    recursividade();
  }

  public static void recursividade() {
    recursividade();
  }
}
