package br.com.tinnova.test5.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDTO {

    private String vehicle;
    private String brand;
    private Long modelYear;
    private String description;
    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;
}
