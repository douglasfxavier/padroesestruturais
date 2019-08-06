public class App {
    public static void main(String[] args) {
        Congresso congresso = new Congresso("Congresso Nacional de Assunto Nenhum");
        congresso.addAssento("A1");
        congresso.addAssento("A2");
        congresso.addAssento("A3");
        congresso.addAssento("A4");
        congresso.addAssento("B1");
        congresso.addAssento("B2");
        congresso.addAssento("B3");
        congresso.addAssento("B4");

        Instituicao instituicao1 = new Instituicao("Organizacao Avulsa");
        Instituicao instituicao2 = new Instituicao("ONG Inexistente");
        Individuo individuo1 = new Individuo("Joao");
        Individuo individuo2 = new Individuo("Jose");
        Individuo individuo3 = new Individuo("Maria");
        Individuo individuo4 = new Individuo("Joana");

        congresso.addParticipante(instituicao1);
        congresso.addParticipante(instituicao2);
        congresso.addParticipante(individuo1);
        congresso.addParticipante(individuo2);
        congresso.addParticipante(individuo3);
        congresso.addParticipante(individuo4);

        congresso.totalAssentos();
        congresso.totalParticipantes();

    }
}
