package modelo;

import interfaces.ILista;

import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada implements ILista{
    protected ArrayList<String> itens;

    public ListaOrdenada() {
        this.itens = new ArrayList<String>();
    }

    @Override
    public void adicionar(String item) {
        itens.add(item);
    }

    @Override
    public void imprimir() {
        for (String item: itens){
            System.out.println(item);
        }
    }
}
