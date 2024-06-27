package com.rivnoj.javacore.exception.exception.test;

import java.util.Scanner;

import com.rivnoj.javacore.exception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest1 {
  public static void main(String[] args) {
    try {
      logar();
    } catch (LoginInvalidoException e) {
      e.printStackTrace();
    }
  }

  private static void logar() throws LoginInvalidoException {
    try (Scanner scanner = new Scanner(System.in)) {
      String usernameDB = "username";
      String passwordDB = "pass";
      System.out.print("Usuário: ");
      String usernameTyped = scanner.nextLine();
      System.out.print("Senha: ");
      String passwordTyped = scanner.nextLine();

      if (!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
        throw new LoginInvalidoException("Usuário ou senha inválidos");
      }

      System.out.println("Usuário logado com sucesso");
    }
  }
}
