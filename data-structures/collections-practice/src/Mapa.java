import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // Trocando o nome, o primeiro nunca se repete no Map
        usuarios.put(1,"Dereck");
        usuarios.put(1, "Felipe");

        usuarios.put(2, "Carlos");
        usuarios.put(3, "Rebeca");
        usuarios.put(4, "Riane");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(1));

        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ---> ");
            System.out.println(registro.getValue());
        }

    }
}
