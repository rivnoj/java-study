package com.rivnoj.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
  public static void main(String[] args) {
    try {
      //throw new ArrayIndexOutOfBoundsException();
      //throw new IndexOutOfBoundsException();
      throw new RuntimeException();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Dentro do ArrayIndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      System.err.println("Dentro do IndexOutOfBoundsException");
    } catch (IllegalArgumentException e) {
      System.err.println("Dentro do IllegalArgumentException");
    } catch (ArithmeticException e) {
      System.err.println("Dentro do ArithmeticException");
    } catch (RuntimeException e) {
      System.err.println("Dentro do RuntimeException");
    } 

    try {
      talvezLanceException();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private static void talvezLanceException() throws SQLException, FileNotFoundException {

  }
}
