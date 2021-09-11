package br.com.tinnova.test5.business;

import br.com.tinnova.test5.dto.CarBrandDTO;

import java.util.List;

public interface CarBrandBusiness {

    List<CarBrandDTO> findAll();
}
