import java.util.ArrayList;
import java.util.List;

public class Instituicao implements IParticipante{
    private String nome;
    private List<Individuo> membros;

    public Instituicao(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<Individuo>();
    }

    public String getNome() {
        return nome;
    }

    public List<Individuo> getMembros() {
        return membros;
    }
}
