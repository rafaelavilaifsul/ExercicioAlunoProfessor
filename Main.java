import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a data de nascimento: ");
        String dataNascimento = teclado.nextLine();
        System.out.print("Digite a turma desse aluno: ");
        String turma = teclado.nextLine();
        Aluno a = new Aluno(nome, dataNascimento, turma);

        System.out.print("\nDigite o nome do professor: ");
        nome = teclado.nextLine();
        System.out.print("Digite a data de nascimento: ");
        dataNascimento = teclado.nextLine();
        System.out.print("Digite a área de atuação: ");
        String area = teclado.nextLine();
        Professor p = new Professor(nome, dataNascimento, area);
        
        System.out.println();
        System.out.println(a);
        System.out.println(p);
    }
}