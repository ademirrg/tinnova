package br.com.tinnova.test5.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car_brand")
@Data
public class CarBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
