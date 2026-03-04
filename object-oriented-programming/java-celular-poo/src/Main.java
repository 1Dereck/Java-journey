import Celulares.Celular;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Celular celular1 = new Celular();
        celular1.marca = "Xiaomi";
        celular1.modelo = "Poco X5 PRO";
        celular1.memoria = 126;
        celular1.cor = "Preto / Cinza";
        celular1.bateria = 5.500;
        celular1.memoriaRAM = 8;
        celular1.original = true;

        System.out.printf("Dados do celular da marca %s do modelo %s. \nEle tem memória de %dGB e sua cor é %s." +
                        "\nAlém disso tem uma bateria de %.3fmAh hora" +
                        " , com %dGB de memória RAM. \nE ele é original ? %b! \n\n", celular1.marca, celular1.modelo, celular1.memoria,
                         celular1.cor, celular1.bateria, celular1.memoriaRAM, celular1.original);


        Celular celular2 = new Celular();
        celular2.marca = sc.nextLine();
        celular2.modelo = sc.nextLine();
        celular2.memoria = sc.nextInt();
        sc.nextLine();
        celular2.cor = sc.nextLine();
        celular2.bateria = sc.nextDouble();
        celular2.memoriaRAM = sc.nextInt();
        celular2.original = sc.nextBoolean();

        System.out.printf("Dados do celular da marca %s do modelo %s. \nEle tem memória de %dGB e sua cor é %s." +
                        "\nAlém disso tem uma bateria de %.3fmAh hora" +
                        " , com %dGB de memória RAM. \nE ele é original ? %b! \n\n", celular2.marca, celular2.modelo, celular2.memoria,
                        celular2.cor, celular2.bateria, celular2.memoriaRAM, celular2.original);



        sc.close();
    }
}