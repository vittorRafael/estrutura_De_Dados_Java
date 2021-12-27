package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {

        //Iniciando a Estrutura de fila
        Queue<String> filaDeBanco = new LinkedList<>();

        //Adicionando a fila
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flavio");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        //Removendo dado no modo fifo (Primeiro que entra, primeiro que sai
        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);

        //Apenas consultando qual é o primeiro da fila
        String primeiroCliente = filaDeBanco.peek();

        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        String primeiroClienteOuErro = filaDeBanco.element();

        //limpando a fila completamente
        filaDeBanco.clear();

        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDeBanco);



    }
}
