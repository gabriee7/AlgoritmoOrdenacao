package com.mycompany.ordenacao;

public class SelectionSort implements IAlgoritmoOrdenacao {

    @Override
    public void ordenar(String[] array, boolean ordem) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (ordem ? array[j].compareTo(array[index]) < 0 : array[j].compareTo(array[index]) > 0) {
                    index = j;
                }
            }
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
