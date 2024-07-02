package com.rivnoj.javacore.string.test;

public class StringBuilderTest1 {
  public static void main(String[] args) {
    String nome = "William Suane";
    nome.concat(" DevDojo");
    System.out.println(nome);

    StringBuilder sb = new StringBuilder("William Suane");
    sb.append(" DevDojo").append(" Academy");
    sb.reverse();
    sb.reverse();
    sb.delete(0, 3);
    System.out.println(sb);
  }
}
