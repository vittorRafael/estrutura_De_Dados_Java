import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String nome: nomes){
            System.out.println("->" + nome);
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes.get(1));

        nomes.remove(4);
        nomes.remove("João");

        int quantidade = nomes.size();
        System.out.println(quantidade);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        for (String nome2 : nomes2){
            nomes.add(nome2);
        }
        System.out.println("=====================================");

        for(String nome: nomes){
            System.out.println("->" + nome);
        }

        Collections.sort(nomes);

        System.out.println("=====================================");

        for(String nome: nomes){
            System.out.println("->" + nome);
        }

        boolean estaVazia = nomes.isEmpty();

        System.out.println(estaVazia);




    }
}
