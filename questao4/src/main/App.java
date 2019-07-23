package main;

import modelo.ListaOrdenada;
import modelo.OrdenadorMarcador;
import modelo.OrdenadorNumeros;

public class App {
    public static void main(String[] args) {

        System.out.println("RECEITA DE BOLO\n");
        ListaOrdenada receita = new ListaOrdenada();
        receita.adicionar("1 kg de farinha de trigo");
        receita.adicionar("500g de margarina");
        receita.adicionar("1 litro de leite");

        // Imprimir lista sem ordenacao
        receita.imprimir();

        // Adicionar numeros aos itens da lista e reimprimir
        OrdenadorNumeros numerador = new OrdenadorNumeros(receita);
        System.out.println("\nRECEITA DE BOLO\n");
        numerador.ordenar();

        // Adicionar marcador aos itens da lista e reimprimir
        OrdenadorMarcador marcador = new OrdenadorMarcador('*',receita);
        System.out.println("\nRECEITA DE BOLO\n");
        marcador.ordenar();
    }
}
