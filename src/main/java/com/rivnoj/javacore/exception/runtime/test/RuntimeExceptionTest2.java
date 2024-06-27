package com.rivnoj.javacore.exception.runtime.test;

public class RuntimeExceptionTest2 {
  public static void main(String[] args) {
    try {
      divisao(1, 0);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }

  /**
   * @param a
   * @param b não pode ser zero
   * @return a/b
   * @throws IllegalArgumentException
   */
  private static int divisao(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
    }
    
    return a/b;
  }
}
