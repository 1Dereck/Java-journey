import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome, tipoDeConta;
        float saldo;

        System.out.println("*********************************");
        System.out.println("---- Cliente informe os dados a seguir r----\n");
        System.out.print("Nome: ");
        nome = leitor.nextLine();

        System.out.print("Tipo conta: ");
        tipoDeConta = leitor.next();

        System.out.print("Saldo: R$ ");
        saldo = leitor.nextFloat();
        System.out.println("*********************************\n\n");

        System.out.println("Operações");
        int opcoes = 0;

        do {
            System.out.println("1- Consoltar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            opcoes = leitor.nextInt();

            switch (opcoes){
                case 1:
                    System.out.printf("\nO saldo atual é de R$ %.2f\n\n", saldo);
                    break;

                case 2:
                    System.out.printf("Informe o valor a receber: ");
                    float saldoRecebido = 0;
                    saldoRecebido = leitor.nextFloat();
                    saldo = saldo + saldoRecebido;
                    System.out.println("Deseja ver seu saldo atual após o recebimento? (s/n)");
                    char simOuNao;
                    simOuNao = leitor.next().charAt(0);
                    if (simOuNao == 's' || simOuNao == 'S') {
                        System.out.printf("\nSaldo atual após recebimento é de R$ %.2f\n\n", saldo);
                    } else {
                        System.out.println("Voltando ao menu....\n");
                    }
                    break;

                case 3:
                    float transferir = 0;
                    System.out.println("Você deseja fazer transferencia? (true/false)");
                    boolean simNao = leitor.nextBoolean();
                    if (simNao == true) {
                        System.out.print("Informe o quanto você deseja transferir: ");
                        transferir = leitor.nextFloat();
                        if (transferir < saldo) {
                            saldo = saldo - transferir;
                            System.out.println("Transferencia realizada com suscesso!\n");
                        }
                        else {
                            System.out.println("Saldo inválido! Você não tem dinheiro o suficiente para realizar esta transação.\n");
                        }
                    } else {
                        System.out.println("Voltando ao menu...\n");
                    }
                    break;

                case 4:
                    System.out.println("\nFinalizando sessão...\n");
                    break;
                default:
                    System.out.println("\nOpção ínvalida! Tente novamente,,,\n");
            }
        } while(opcoes != 4);
    }
}