package main;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdapter<K> extends HashMap<K,K> implements Map<K,K>, Serializable, Cloneable {
    public HashMapAdapter(){
        super();
    }

    public HashMapAdapter(K[][] matriz) throws NullPointerException, IllegalArgumentException{
        // Número de vetores (linhas) da matriz
        int numLinhas = matriz.length;
        // Número de elementos em cada vetor (linha), o primeiro com chaves e o segundo com valores
        int NumColLinha1 = matriz[0].length;
        int NumColLinha2 = matriz[1].length;

        /////////////////////////////////////
        // TESTES ANTES DE CONSTRUIR O MAP //
        /////////////////////////////////////

        // Testa se a matriz passada como parâmetro foi inicializada. Caso nula, lança exceção NullPointExcepption
        if (matriz == null){
            throw new NullPointerException("Erro: A matriz passada é nula.");
        }

        // Testa se a matriz tem exatamente dois vetores. Caso contrário, lança exceção de valor ilegal
        if (numLinhas !=2){
            throw new IllegalArgumentException("Erro: A matriz passada não atende ao requisito de dois vetores.");
        }

        // Testa se a matriz é irregular, com diferença no número de elementos entre os dois vetores
        if (NumColLinha1 != NumColLinha2){
            throw new IllegalArgumentException("Erro: A matriz passada é desigual.");
        }

        //////////////////////////////////
        // INSTANCIAÇÃO DO MAP ADAPTADO //
        //////////////////////////////////

        for(int indice = 0; indice < NumColLinha1; indice++){
            K chave = matriz[0][indice];
            K valor = matriz[1][indice];

            put(chave,valor);
        }

    }

}
