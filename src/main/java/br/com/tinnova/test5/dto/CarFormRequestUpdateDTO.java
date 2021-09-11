package br.com.tinnova.test5.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class CarFormRequestUpdateDTO extends BaseCarFormDTO {

    @NotBlank(message = "O Campo vehicle é obrigatório")
    @Size(max = 100)
    private String vehicle;

    @NotBlank(message = "O Campo brand é obrigatório")
    @Size(max = 100)
    private String brand;

    @NotNull(message = "O Campo modelYear é obrigatório")
    private Long modelYear;

    @Size(max = 300)
    private String description;

    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;
}
