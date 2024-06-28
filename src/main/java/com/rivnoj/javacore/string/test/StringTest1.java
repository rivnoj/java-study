package com.rivnoj.javacore.string.test;

public class StringTest1 {
  public static void main(String[] args) {
    String nome = "Pedro";//String constant pool (conceito chamada string interning)
    String nome2 = "Pedro";
    nome = nome.concat(" de Alcantara");
    System.out.println(nome);
    System.out.println(nome == nome2);

    String nome3 = new String("Pedro");//criando 1 variavel de referencia, 1 objeto do tipo sting e 1 string no pool de strings

    System.out.println(nome2 == nome3);
    System.out.println(nome2 == nome3.intern());
  }
}
