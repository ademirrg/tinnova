package br.com.tinnova.test5.business;

import br.com.tinnova.test5.dto.CarDTO;

import java.util.List;

public interface CarBusiness {
    List<CarDTO> findAll();
    CarDTO findCarById(Long id);
}
