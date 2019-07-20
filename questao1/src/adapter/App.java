package adapter;

import main.HashMapAdapter;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        String [][] dadosMatriz = {
               // chaves
               {"Nome","Cidade","Gênero","CPF"},
               // valores
               {"José","João Pessoa","M","123457890-9"}
        };

        Map<String,String> dadosMap = new HashMapAdapter<String>(dadosMatriz);

        System.out.println("///////////////   DADOS DO MAP   ///////////////");

        for(String chave : dadosMap.keySet()) {
            System.out.println(
                    String.format("%s : %s",
                                   chave, dadosMap.get(chave)));
        }
    }
}
