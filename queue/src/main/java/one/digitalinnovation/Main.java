package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot"))); //adiciona valor, caso não consiga, retorna erro
        System.out.println(queueCarros);

        // offer é parecido com add. Diferenca é que o add se
        System.out.println(queueCarros.offer(new Carro("Renault"))); //adiciona valor, caso não consiga, retorna false
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //pega o primeiro da fila e não remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //pega o primeiro da fila e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());
    }
}
