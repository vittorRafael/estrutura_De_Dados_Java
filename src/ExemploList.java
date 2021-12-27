import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //declarando uma nova lista
        List<String> nomes = new ArrayList<>();

        //adicionando dados na lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //editando dados na lista (posição, dadoNovo)
        nomes.set(2,"Larissa");

        System.out.println(nomes);

        //colocando a lista em ordem alfabetica
        Collections.sort(nomes);

        nomes.set(2,"Wesley");

        System.out.println(nomes);

        //removendo dado da lista (posição)
        nomes.remove(4);

        System.out.println(nomes);

        //removendo dado da lista (dado)
        nomes.remove("Wesley");

        System.out.println(nomes);

        //retorna o dado na lista (posição)
        String nome = nomes.get(3);

        System.out.println(nome);

        //retorna um inteiro mostrando a posição do dado (dado)
        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        //retorna o tamanho da lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        //retorna se tem o dado na lista (dado)
        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        //retorna se a lista esta vazia
        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        //apaga todos os elementos da lista

        for(String nomeDoItem: nomes){
            System.out.println(" ---> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        //retorna um booleando sempre que existir mais de um objeto
        while(iterator.hasNext()){
            System.out.println(" ---> " + iterator.next());
        }


        nomes.clear();
        listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);


    }
}
