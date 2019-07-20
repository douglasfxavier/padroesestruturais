package main;

import interfaces.ImplementacaoRefrigerante;
import modelo.*;

public class App {

    public static void main(String[] args) {
        TamanhoPequeno copoPequenoCoca = new TamanhoPequeno(new CocaCola());
        TamanhoMedio copoMedioGuarana = new TamanhoMedio(new Guarana());
        TamanhoGrande copoGrandeFanta = new TamanhoGrande(new Fanta());
        copoPequenoCoca.beber();
        copoMedioGuarana.beber();
        copoGrandeFanta.beber();
    }
}
