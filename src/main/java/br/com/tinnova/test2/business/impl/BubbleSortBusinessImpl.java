package br.com.tinnova.test2.business.impl;

import br.com.tinnova.test2.business.BubbleSortBusiness;
import br.com.tinnova.test2.dto.BubbleSortRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class BubbleSortBusinessImpl implements BubbleSortBusiness {

    public Integer[] getBubbleSort(BubbleSortRequestDTO requestDTO) {
        return orderVector(requestDTO.getArrayBubbleSort());
    }

    public static Integer[] orderVector(Integer[] vector) {

        for(int i = 0; i < vector.length - 1; i++) {
            boolean isInOrder = true;
            for(int j = 0; j < vector.length - 1 - i; j++) {
                if(vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    isInOrder = false;
                }
            }
            if(isInOrder)
                break;
        }
        return vector;
    }
}
