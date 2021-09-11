package br.com.tinnova.test5.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model_year")
    private Long modelYear;

    @Column(name = "description")
    private String description;

    @Column(name = "sold")
    private Boolean sold;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;
}
