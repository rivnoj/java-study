package com.rivnoj.javacore.wrapper.test;

public class WrapperTest1 {
  public static void main(String[] args) {
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10F;
    double doubleP = 10D;
    char charP = 'W';
    boolean booleanP = false;

    System.out.println(byteP);
    System.out.println(shortP);
    System.out.println(intP);
    System.out.println(longP);
    System.out.println(floatP);
    System.out.println(doubleP);
    System.out.println(charP);
    System.out.println(booleanP);

    //autoboxing
    Byte byteW = 1;
    Short shortW = 1;
    Integer intW = 1;
    Long longW = 10L;
    Float floatW = 10F;
    Double doubleW = 10D;
    Character charW = 'W';
    Boolean booleanW = false;

    System.out.println(byteW);
    System.out.println(shortW);
    System.out.println(intW);
    System.out.println(longW);
    System.out.println(floatW);
    System.out.println(doubleW);
    System.out.println(charW);
    System.out.println(booleanW);
    
    //unboxing
    int i = intW;
    Integer intW2 = Integer.parseInt("1");
    boolean verdadeiro = Boolean.parseBoolean("True");
    
    System.out.println(i);
    System.out.println(intW2);
    System.out.println(verdadeiro);

    System.out.println(Character.isDigit('A'));
    System.out.println(Character.isDigit('9'));
    System.out.println(Character.isLetterOrDigit('!'));
    System.out.println(Character.isUpperCase('A'));
    System.out.println(Character.isLowerCase('a'));
    System.out.println(Character.toUpperCase('a'));
    System.out.println(Character.toLowerCase('A'));
  }
}
