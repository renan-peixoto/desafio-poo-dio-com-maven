package br.com.desafio.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class DevTeste {
  Conteudo cursoJava = new Curso("java", "curso java descriçao", 2);

  Conteudo mentoria = new Mentoria("TDD", "Mentoria de TDD", LocalDate.now());

  Bootecamp bootecamp = new Bootecamp("Java Bootcamp", "descriçao");

  @Test
  void inscreverBootcamp() {

    Dev testDev = new Dev("Renan");
    bootecamp.getConteudos().add(cursoJava);
    bootecamp.getConteudos().add(mentoria);
    testDev.inscreverBootcamp(bootecamp);
    assertEquals(bootecamp.getConteudos(), testDev.getConteudosInscritos());
  }

  @Test
  void progredirTeste() {
    Dev testDev = new Dev("Renan");
    bootecamp.getConteudos().add(cursoJava);
    bootecamp.getConteudos().add(mentoria);
    testDev.inscreverBootcamp(bootecamp);
    testDev.progredir();
    testDev.progredir();
    Optional<Conteudo> conteudo = bootecamp.getConteudos().stream().findFirst();
    assertTrue(testDev.getConteudosConcluidos().contains(conteudo.get()));
  }

  @Test
  void calcularXpTotal() {
    Dev testDev = new Dev("Renan");

    bootecamp.getConteudos().add(cursoJava);
    bootecamp.getConteudos().add(mentoria);
    testDev.inscreverBootcamp(bootecamp);
    testDev.progredir();

    assertEquals(20d, testDev.calcularTotalXp());

  }
}
