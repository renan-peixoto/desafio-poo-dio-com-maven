import java.time.LocalDate;

import br.com.desafio.dominio.Bootecamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("java", "curso java descriçao", 2);
        Mentoria mentoria = new Mentoria("TDD", "Mentoria de TDD", LocalDate.of(2023, 03, 15));
        Bootecamp bootecamp = new Bootecamp("Java Bootcamp", "descriçao");
        Dev renanDev = new Dev("Renan");

        bootecamp.getConteudos().add(cursoJava);
        bootecamp.getConteudos().add(mentoria);
        renanDev.inscreverBootcamp(bootecamp);
        renanDev.progredir();
        renanDev.progredir();

        System.out.println("Conteúdos Inscritos Renan:" + renanDev.getConteudosInscritos());

        System.out.println(renanDev.calcularTotalXp());
        System.out.println(renanDev.getConteudosConcluidos());
    }
}
