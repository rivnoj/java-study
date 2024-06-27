package com.rivnoj.javacore.exception.runtime.test;

public class RuntimeExceptionTest3 {
  public static void main(String[] args) {
    System.out.println(abreConexao());
    abreConexao2();
  }

  private static String abreConexao() {
    try {
      System.out.println("Abrindo arquivo");
      System.out.println("Escrevendo dados no arquivo");
      return "Conexão aberta";
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Liberando recursos do SO");
    }

    return null;
  }

  private static void abreConexao2() {
    try {
      System.out.println("Abrindo arquivo");
      System.out.println("Escrevendo dados no arquivo");
    } finally {
      System.out.println("Liberando recursos do SO");
    }
  }
}
