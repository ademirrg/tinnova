package br.com.tinnova.test5.business;

import br.com.tinnova.test5.dto.BaseCarFormDTO;
import br.com.tinnova.test5.dto.CarDTO;

import java.util.List;

public interface CarBusiness {
    List<CarDTO> findAll();
    CarDTO findCarById(Long id);
    CarDTO insertCar(BaseCarFormDTO requestDTO);
    CarDTO updateCar(BaseCarFormDTO requestDTO);
    void deleteCar(Long id);
}
