package br.com.tinnova.test5.business.impl;

import br.com.tinnova.test5.business.CarBrandBusiness;
import br.com.tinnova.test5.dto.CarBrandDTO;
import br.com.tinnova.test5.entity.CarBrand;
import br.com.tinnova.test5.repository.CarBrandRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarBrandBusinessImpl implements CarBrandBusiness {

    @Autowired @Lazy
    CarBrandRepository repository;

    @Autowired
    ModelMapper mapper;

    public List<CarBrandDTO> findAll() {
        List<CarBrand> carBrands = repository.findAll();
        return carBrands.stream()
                .map(carBrand -> mapper.map(carBrand, CarBrandDTO.class))
                .collect(Collectors.toList());
    }
}
