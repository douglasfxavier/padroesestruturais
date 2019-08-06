public class App {
    public static void main(String[] args) {
        Pasta pasta1 = new Pasta("Raiz");
        Pasta pasta2 = new Pasta("Arquivos de texto");
        Pasta pasta3 = new Pasta("Fotos");
        Pasta pasta4 = new Pasta("Textos especiais");
        Arquivo arquivo1 = new Arquivo("Texto1.txt",50);
        Arquivo arquivo2 = new Arquivo("Texto2.txt",30);
        Arquivo arquivo3 = new Arquivo("Poemas.txt",40);
        Arquivo foto1 = new Arquivo("Foto2016.jpg",250);
        Arquivo foto2 = new Arquivo("Foto2017.jpg",170);
        pasta1.addPasta(pasta2);
        pasta1.addPasta(pasta3);
        pasta2.addPasta(pasta4);
        pasta4.addArquivo(arquivo3);
        pasta2.addArquivo(arquivo1);
        pasta2.addArquivo(arquivo2);
        pasta3.addArquivo(foto1);
        pasta3.addArquivo(foto2);

        pasta1.listar("\t");
    }
}
