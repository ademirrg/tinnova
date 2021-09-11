package br.com.tinnova.test5.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class CarFormRequestPatchDTO extends BaseCarFormDTO {

    @Size(max = 100)
    private String vehicle;

    @Size(max = 100)
    private String brand;

    private Long modelYear;

    @Size(max = 300)
    private String description;

    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;
}
