package modelo;

public class Chaves extends ComponentDecorator {
    NumeroUm numeroUm;

    public Chaves(NumeroUm numeroUm){
        this.numeroUm = numeroUm;
    }

    @Override
    public void imprimir() {
        System.out.print('{');
        this.numeroUm.imprimir();
        System.out.print('}');
    }
}
