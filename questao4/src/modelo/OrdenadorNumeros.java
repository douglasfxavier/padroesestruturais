package modelo;

import interfaces.AbrastracaoOrdenador;

public class OrdenadorNumeros extends AbrastracaoOrdenador {
    ListaOrdenada listaOrdenada;

    public OrdenadorNumeros(ListaOrdenada lista) {
        super(lista);
        this.listaOrdenada = lista;
    }


    @Override
    public void ordenar() {
        int tamanhoLista = this.listaOrdenada.itens.size();
        for(int indice=0; indice<tamanhoLista; indice++){
            System.out.println(String.format("%s) %s",indice+1,listaOrdenada.itens.get(indice)));
        }
    }
}
