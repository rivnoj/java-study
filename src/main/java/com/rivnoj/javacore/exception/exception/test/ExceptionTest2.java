package com.rivnoj.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
  public static void main(String[] args) throws IOException {
    criarNovoArquivo();
  }

  public static void criarNovoArquivo() throws IOException {
    File file = new File("arquivo/test.txt");
    
    try {
      boolean isCreated = file.createNewFile();
      System.out.println("Arquivo criado " + isCreated);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}
