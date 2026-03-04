import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem vindo! Informe data, mes e ano");

        DataTeste p1 = new DataTeste();

        System.out.print("Preencha o dia: ");
        p1.dia = sc.nextInt();

        System.out.print("Preencha o mes em números: ");
        p1.mes = sc.nextInt();

        System.out.print("Preencha o ano: ");
        p1.ano = sc.nextInt();

        System.out.println("\nRepita novamente com outros dados...");
        DataTeste p2 = new DataTeste();

        System.out.print("Preencha o dia: ");
        p2.dia = sc.nextInt();

        System.out.print("Preencha o mes em números: ");
        p2.mes = sc.nextInt();

        System.out.print("Preencha o ano: ");
        p2.ano = sc.nextInt();

        p1.diaMesAno();
        p2.diaMesAno();

        System.out.println("----------------------------------");
        System.out.printf(p1.obterDataFormatada());
        System.out.printf(p2.obterDataFormatada());
    }
}
