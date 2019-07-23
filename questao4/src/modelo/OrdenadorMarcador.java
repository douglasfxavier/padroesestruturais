package modelo;

import interfaces.ILista;
import interfaces.AbrastracaoOrdenador;

public class OrdenadorMarcador extends AbrastracaoOrdenador {
    char marcador;
    ListaOrdenada listaOrdenada;

    public OrdenadorMarcador(char marcador,ListaOrdenada lista) {
        super(lista);
        this.listaOrdenada = lista;
        this.marcador = marcador;
    }


    @Override
    public void ordenar() {
        for(String item: this.listaOrdenada.itens){
            System.out.println(String.format("%s %s",marcador,item));
        }
    }
}
