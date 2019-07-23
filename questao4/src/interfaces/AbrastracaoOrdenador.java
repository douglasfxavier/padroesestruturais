package interfaces;

public abstract class AbrastracaoOrdenador {
    protected ILista lista;

    public AbrastracaoOrdenador(ILista lista) {

        this.lista = lista;
    }

    public abstract void ordenar();
}
