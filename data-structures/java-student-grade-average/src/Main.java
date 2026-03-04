import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Seja bem vindo Aluno!\nInforme quantas provas realizou: ");
        int qtdNotas = sc.nextInt();

        double[] notaProvas = new double[qtdNotas];

        for(int i = 0; i < notaProvas.length; i++) {
            System.out.printf("Prova %d: ", i + 1);

            notaProvas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota : notaProvas) {
            total += nota;
        }
        double media = total + notaProvas.length;
        System.out.printf("Sua media é de: %.2f%n", media);

        for( double nota : notaProvas) {
            System.out.println(nota);
        }
    }
}