public class Individuo implements IParticipante {
    private String nome;
    private String assento;

    public Individuo(String nome) {
        this.nome = nome;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getNome() {
        return nome;
    }

    public String getAssento() {
        return assento;
    }
}
