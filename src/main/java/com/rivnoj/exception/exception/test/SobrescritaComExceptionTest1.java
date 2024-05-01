package com.rivnoj.exception.exception.test;

import com.rivnoj.exception.exception.dominio.Funcionario;
import com.rivnoj.exception.exception.dominio.LoginInvalidoException;

public class SobrescritaComExceptionTest1 {
  public static void main(String[] args) {
    //Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();
    try {
      funcionario.salvar();
    } catch (LoginInvalidoException e) {
      e.printStackTrace();
    }
  }
}
