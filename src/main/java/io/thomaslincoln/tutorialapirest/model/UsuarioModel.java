package io.thomaslincoln.tutorialapirest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Isso é para dizer que é uma entidade, é um modelo de dados, uma tabela
@Entity(name = "usuario")
public class UsuarioModel {

  @Id
  public Integer codigo;

  @Column(nullable = false, length = 50)
  public String nome;

  @Column(nullable = false, length = 10)
  public String login;

  @Column(nullable = false, length = 50)
  public String senha;


  public Integer getCodigo() {
    return codigo;
  }
  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
}
