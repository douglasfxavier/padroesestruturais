package main;

import modelo.Chaves;
import modelo.Colchetes;
import modelo.NumeroUm;
import modelo.Parenteses;

public class App {

    public static void main(String[] args) {
        NumeroUm numeroUm;
        numeroUm = new Parenteses(new NumeroUm());
        numeroUm.imprimir();
        numeroUm = new Chaves(new NumeroUm());
        numeroUm.imprimir();
        numeroUm = new Colchetes(new NumeroUm());
        numeroUm.imprimir();
    }

}
