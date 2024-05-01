package com.rivnoj.exception.exception.dominio;

public class Funcionario extends Pessoa {

  public void salvar() throws LoginInvalidoException, RuntimeException {
    System.out.println("Salvando funcionário");
  }
}
