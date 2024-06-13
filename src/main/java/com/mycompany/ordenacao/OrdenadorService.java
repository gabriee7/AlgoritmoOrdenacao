package com.mycompany.ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdenadorService {
    private Map<String, IAlgoritmoOrdenacao> algoritmosDisponivel;
    
    public OrdenadorService(){
        this.algoritmosDisponivel = new HashMap<>();
        this.algoritmosDisponivel.put("BobbleSort", new BubbleSort());
        this.algoritmosDisponivel.put("SelectionSort", new SelectionSort());
    }

    public void ordenar(String metodo, String[] array, boolean ordem) {
        IAlgoritmoOrdenacao algoritmo = this.algoritmosDisponivel.get(metodo);
        algoritmo.ordenar(array, ordem);
    }
    
    public List<String> getNomesAlgoritmos(){
        List<String> nomes = new ArrayList<>();
        
        for(Map.Entry<String, IAlgoritmoOrdenacao> elem : algoritmosDisponivel.entrySet()){
            nomes.add(elem.getKey());
        }
        return nomes;
    }
}