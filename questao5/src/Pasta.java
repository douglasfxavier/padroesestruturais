import java.util.ArrayList;
import java.util.List;

public class Pasta implements IDiretorio {
    protected String nome;
    protected List<Pasta> pastas;
    protected List<Arquivo> arquivos;

    public Pasta(String nome) {
        this.nome = nome;
        this.pastas = new ArrayList<Pasta>();
        this.arquivos = new ArrayList<Arquivo>();
    }

    public void addPasta(Pasta pasta){
        this.pastas.add(pasta);
    }

    public void addArquivo(Arquivo arquivo){
        this.arquivos.add(arquivo);
    }


    public String getNome() {
        return nome;
    }

    public List<Pasta> getPastas() {
        return pastas;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    @Override
    public void listar(String tab) {
        System.out.println(tab + this.getNome());
        tab += "\t";
        for(Pasta pasta : this.pastas){
            pasta.listar(tab);
            String tab2 = tab + "\t";
            for (Arquivo arquivo : pasta.getArquivos()){
                System.out.println(String.format("%s%s %s KB",tab2, arquivo.getNome(),arquivo.getTamanho()));

            }
        }

    }
}
