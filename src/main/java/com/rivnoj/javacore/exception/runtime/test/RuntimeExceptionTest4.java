package com.rivnoj.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
  public static void main(String[] args) {
    try {
      //throw new ArrayIndexOutOfBoundsException();
      //throw new IndexOutOfBoundsException();
      throw new RuntimeException();
    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
      System.err.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
    } catch (IndexOutOfBoundsException e) {
      System.err.println("Dentro do IndexOutOfBoundsException");
    } catch (RuntimeException e) {
      System.err.println("Dentro do RuntimeException");
    } 

    try {
      talvezLanceException();
    } catch (SQLException | FileNotFoundException e) {
      e.printStackTrace();
    } 
  }

  private static void talvezLanceException() throws SQLException, FileNotFoundException {

  }
}
