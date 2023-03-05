package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  private LocalDate data;
  private final double XP_MENTORIA = 20d;

  public Mentoria(String titulo, String descricao, LocalDate data) {
    super(titulo, descricao);
    this.data = data;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + XP_MENTORIA;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Mentorias [titulo=" + getTitulo() + ", descricao=" + getDescricao() + "data=" + data + "]";
  }

}
