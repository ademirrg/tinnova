package br.com.tinnova.test5.controller;

import br.com.tinnova.test5.business.CarBusiness;
import br.com.tinnova.test5.dto.CarDTO;
import br.com.tinnova.test5.dto.CarFormRequestInsertDTO;
import br.com.tinnova.test5.dto.CarFormRequestPatchDTO;
import br.com.tinnova.test5.dto.CarFormRequestUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/test-5/vehicle")
public class CarController {

    @Autowired @Lazy
    CarBusiness business;

    @GetMapping
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

    @PostMapping
    private ResponseEntity<CarDTO> insertCar(@Valid @RequestBody CarFormRequestInsertDTO requestDTO) {
        return ResponseEntity.ok(business.insertCar(requestDTO));
    }

    @PutMapping("{id}")
    private ResponseEntity<CarDTO> updateCar(@Valid @RequestBody CarFormRequestUpdateDTO requestDTO, @PathVariable Long id) {
        requestDTO.setId(id);
        return ResponseEntity.ok(business.updateCar(requestDTO));
    }

    @PatchMapping("{id}")
    private ResponseEntity<CarDTO> patchCar(@Valid @RequestBody CarFormRequestPatchDTO requestDTO, @PathVariable Long id) {
        requestDTO.setId(id);
        return ResponseEntity.ok(business.updateCar(requestDTO));
    }

    @PostMapping("{id}")
    private ResponseEntity<CarDTO> deleteCar(@PathVariable Long id) {
        business.deleteCar(id);
        return ResponseEntity.ok().build();
    }

}
