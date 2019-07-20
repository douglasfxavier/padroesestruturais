package modelo;

public class Parenteses extends ComponentDecorator {

    NumeroUm numeroUm;

    public Parenteses(NumeroUm numeroUm){
        this.numeroUm = numeroUm;
    }


    @Override
    public void imprimir() {
        System.out.print('(');
        this.numeroUm.imprimir();
        System.out.print(')');
    }
}
