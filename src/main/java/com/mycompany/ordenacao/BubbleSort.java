package com.mycompany.ordenacao;

public class BubbleSort implements IAlgoritmoOrdenacao {

    @Override
    public void ordenar(String[] array, boolean ordem) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (ordem ? array[j].compareTo(array[j + 1]) > 0 : array[j].compareTo(array[j + 1]) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
