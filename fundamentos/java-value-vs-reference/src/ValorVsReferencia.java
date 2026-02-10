public class ValorVsReferencia {

    int a = 12;
    int b = 21;

    public static void main(String[] args) {
        ValorVsReferencia num1 = new ValorVsReferencia();
        System.out.println(num1.a);
        System.out.println(num1.b);

        double a = 2.1;
        double b = 3.1; // Atribuição por valor

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // Atribuição por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2077;

        System.out.println("\nd1---------------------------------");
        System.out.println(d1.dia);
        System.out.println(d1.mes);
        System.out.println(d1.ano);

        System.out.println("\nd2---------------------------------");
        System.out.println(d2.dia);
        System.out.println(d2.mes);
        System.out.println(d2.ano);

        System.out.println("Ambas estão apontando para o mesmo objeto! Entao se um mudar o outro muda tambem");

    }
}
