import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("java", "descricao java", 8);
        System.out.println(curso1.calcularXp());
    }
}
