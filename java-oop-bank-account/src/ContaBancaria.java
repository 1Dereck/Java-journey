public class ContaBancaria {

    String titular;
    int numeroConta;
    double saldo;

    ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    void mostrarDados() {
        System.out.printf("Seu saldo atual é de: %.2f%n", saldo);
    }
}
