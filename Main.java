import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a turma desse aluno: ");
        String turma = teclado.nextLine();
        Aluno a = new Aluno(nome, turma);

        System.out.print("Digite o nome do professor: ");
        nome = teclado.nextLine();
        System.out.print("Digite a área de atuação: ");
        String area = teclado.nextLine();
        Professor p = new Professor(nome, area);
        
        System.out.println("O aluno " + a.getNome()
            + " da turma " + a.getTurma()
            + " tem aula de " + p.getArea()
            + " com o Prof. " + p.getNome());
    }
}