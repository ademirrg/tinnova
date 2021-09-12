package br.com.tinnova.test2.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BubbleSortRequestDTO {

    @NotNull(message = "O campo arrayBubbleSort é obrigatório")
    private Integer[] arrayBubbleSort;
}
