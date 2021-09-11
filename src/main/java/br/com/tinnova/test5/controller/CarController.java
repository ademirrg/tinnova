package br.com.tinnova.test5.controller;

import br.com.tinnova.test5.business.CarBusiness;
import br.com.tinnova.test5.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test-5/vehicle")
public class CarController {

    @Autowired @Lazy
    CarBusiness business;

    @GetMapping()
    private ResponseEntity<List<CarDTO>> findAllCars() {
        List<CarDTO> cars = business.findAll();
        if (cars.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/{id}")
    private ResponseEntity<CarDTO> findCarById(@PathVariable Long id) {
        CarDTO car = business.findCarById(id);
        if (car == null)  {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(car);
    }

}
