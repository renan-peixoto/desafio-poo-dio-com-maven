package br.com.desafio.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConteudoTeste {

    @Test
    void calcularValorXpCurso() {
        Curso curso1 = new Curso(null, null, 8);
        Assertions.assertEquals(80.0, curso1.calcularXp());

        Curso curso2 = new Curso(null, null, 6);
        Assertions.assertEquals(60.0, curso2.calcularXp());

        Curso curso3 = new Curso(null, null, 2);
        Assertions.assertEquals(20.0, curso3.calcularXp());
    }
}
