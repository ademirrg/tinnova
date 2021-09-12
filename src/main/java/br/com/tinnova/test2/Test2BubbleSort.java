package br.com.tinnova.test2;

public class Test2BubbleSort {

    public static void main(String args[]) {
        int[] vector = {5, 3, 2, 4, 7, 1, 0, 6};
        order(vector);
        for(int num : vector) {
            System.out.print(num + " ");
        }
    }

    public static void order(int[] vector) {

        for(int i = 0; i < vector.length - 1; i++) {
            boolean isOrder = true;
            for(int j = 0; j < vector.length - 1 - i; j++) {
                if(vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    isOrder = false;
                }
            }
            if(isOrder)
                break;
        }
    }
}
