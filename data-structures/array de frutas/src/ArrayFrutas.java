public class ArrayFrutas {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Morango"};

        System.out.println("Minhas frutas favoritas:");

        for(int i = 0; i < frutas.length; i++) {
            System.out.println((i+1) + ". " + frutas[i]);
        }

        System.out.println("\nTotal de frutas: " + frutas.length);
        System.out.println("Primeira fruta: " + frutas[0]);
        System.out.println("Última fruta: " + frutas[frutas.length - 1]);
    }
}