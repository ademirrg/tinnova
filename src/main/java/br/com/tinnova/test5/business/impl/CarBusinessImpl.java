package br.com.tinnova.test5.business.impl;

import br.com.tinnova.test5.business.CarBusiness;
import br.com.tinnova.test5.dto.BaseCarFormDTO;
import br.com.tinnova.test5.dto.CarDTO;
import br.com.tinnova.test5.entity.Car;
import br.com.tinnova.test5.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
        return mapper.map(car.get(), CarDTO.class);
    }

    public CarDTO insertCar(BaseCarFormDTO requestDTO) {
        Car car = mapper.map(requestDTO, Car.class);
        return mapper.map(repository.save(car), CarDTO.class);
    }

    public CarDTO updateCar(BaseCarFormDTO requestDTO) {
        if (repository.existsById(requestDTO.getId())) {
            Car car = mapper.map(requestDTO, Car.class);
            car.setUpdated(LocalDateTime.now());
            return mapper.map(repository.save(car), CarDTO.class);
        }
        return null;
    }

    public void deleteCar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
