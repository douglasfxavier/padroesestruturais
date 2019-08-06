import java.util.ArrayList;
import java.util.List;

public class Congresso implements ICongresso {
    private String nome;
    private List<IParticipante> participantes;
    private List<String> assentos;

    public Congresso(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<IParticipante>();
        this.assentos = new ArrayList<String>();
    }

    public void addAssento(String assento){
        this.assentos.add(assento);
    }

    public  void addParticipante(IParticipante participante){
        this.participantes.add(participante);
    }

    @Override
    public void totalParticipantes() {
        System.out.println(String.format("%s particpantes",participantes.size()));
    }

    @Override
    public void totalAssentos() {
        System.out.println(String.format("%s assentos",assentos.size()));
    }

}
