package modelo;

public class Colchetes extends ComponentDecorator {
    NumeroUm numeroUm;

    public Colchetes(NumeroUm numeroUm){
        this.numeroUm = numeroUm;
    }

    @Override
    public void imprimir() {
        System.out.print('[');
        this.numeroUm.imprimir();
        System.out.print(']');
    }
}
