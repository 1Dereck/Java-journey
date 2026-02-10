public class Main {
    public static void main(String[] args) {

        ContaBancaria p1 = new ContaBancaria("Dereck", 12315, 2000.99);
        //p1.titular = "felipe";

        p1.mostrarDados();
        p1.depositar(500.00);
        p1.mostrarDados();
        p1.sacar(200.88);
        p1.mostrarDados();

    }
}