package br.com.tinnova.test5.business.impl;

import br.com.tinnova.test5.business.CarBusiness;
import br.com.tinnova.test5.dto.CarDTO;
import br.com.tinnova.test5.entity.Car;
import br.com.tinnova.test5.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarBusinessImpl implements CarBusiness {

    @Autowired @Lazy
    CarRepository repository;

    @Autowired
    ModelMapper mapper;

    public List<CarDTO> findAll() {
        List<Car> cars = repository.findAll();
        return cars.stream()
                .map(car -> mapper.map(car, CarDTO.class))
                .collect(Collectors.toList());
    }

    public CarDTO findCarById(Long id) {
        Optional<Car> car = repository.findById(id);
        if (car.isEmpty()) {
            return null;
        }
        return CarDTO.builder()
                .vehicle(car.get().getVehicle())
                .brand(car.get().getBrand())
                .modelYear(car.get().getModelYear())
                .description(car.get().getDescription())
                .sold(car.get().getSold())
                .created(car.get().getCreated())
                .updated(car.get().getUpdated())
                .build();
    }
}
