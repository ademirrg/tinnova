package br.com.tinnova.test5.controller;

import br.com.tinnova.test5.business.CarBrandBusiness;
import br.com.tinnova.test5.dto.CarBrandDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test-5/car-brand")
public class CarBrandController {

    @Autowired @Lazy
    CarBrandBusiness business;

    @GetMapping
    private ResponseEntity<List<CarBrandDTO>> findAllBrands() {
        List<CarBrandDTO> carBrands = business.findAll();
        if (carBrands.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carBrands);
    }
}
