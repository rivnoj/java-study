package com.rivnoj.exception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.rivnoj.exception.exception.dominio.Leitor1;
import com.rivnoj.exception.exception.dominio.Leitor2;

public class TryWithResourcesTest1 {
  public static void main(String[] args) {
    lerAquivo2();
  }

  public static void lerAquivo1() {
    Reader reader = null;

    try {
      reader = new BufferedReader(new FileReader("teste.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void lerAquivo2() {
    try (Leitor1 leitor1 = new Leitor1();
         Leitor2 leitor2 = new Leitor2()) {
      
    } catch (IOException e) {
      
    }
  }
}
