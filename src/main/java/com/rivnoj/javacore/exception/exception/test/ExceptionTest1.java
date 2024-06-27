package com.rivnoj.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest1 {
  public static void main(String[] args) {
    criarNovoArquivo();
  }

  private static void criarNovoArquivo() {
    File file = new File("arquivo/test.txt");
    
    try {
      boolean isCreated = file.createNewFile();
      System.out.println("Arquivo criado " + isCreated);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
