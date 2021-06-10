import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        Estudante estudanteA = new Estudante("Maria", "Rua do Jardim, nº 542 - Ilha Joana Bezerra, Recife-PE");
        estudanteA.addCursoNota("Programação", 8);
        estudanteA.addCursoNota("Lógica de Programação", 7);
        estudanteA.addCursoNota("Banco de Dados", 10);

        Estudante estudanteB = new Estudante("João", "Rua Itubera, nº 985 - Santo Amaro, Recife-PE");
        estudanteB.addCursoNota("Programação", 9);
        estudanteB.addCursoNota("Rede de Computadores", 10);

        Estudante estudanteC = new Estudante("José", "Av. Othon Bezerra de Melo, nº 4568 - Monteiro, Recife-PE");
        estudanteC.addCursoNota("Programação", 7);
        estudanteC.addCursoNota("Banco de Dados", 7);

        Professor professorA = new Professor("Leandro", "Rua Engenho Parol, nº 05 - Vasco da Gama, Recife-PE");
        professorA.addCurso("Programação");
        professorA.addCurso("Rede de Computadores");

        Professor professorB = new Professor("Joana", "Rua Manoel Florentino, nº 362 - Tiúma, São Lourenço da Mata-PE");
        professorB.addCurso("Lógica de Programação");
        professorB.addCurso("Banco de Dados");

        pessoas.add(estudanteA);
        pessoas.add(estudanteB);
        pessoas.add(estudanteC);
        pessoas.add(professorA);
        pessoas.add(professorB);

        for(int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getClass() == Estudante.class) {
                System.out.println(p.toString());
            } else {
                System.out.println(p.toString());
            }
        }
    }
}
