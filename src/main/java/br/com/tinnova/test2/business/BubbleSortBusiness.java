package br.com.tinnova.test2.business;

import br.com.tinnova.test2.dto.BubbleSortRequestDTO;

public interface BubbleSortBusiness {
    Integer[] getBubbleSort(BubbleSortRequestDTO requestDTO);
}
