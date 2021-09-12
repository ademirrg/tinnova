package br.com.tinnova.test3.controller;

import br.com.tinnova.test3.business.FactorialBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-3/factorial")
public class FactorialController {

    @Autowired @Lazy
    FactorialBusiness business;

    @GetMapping("{number}")
    private ResponseEntity<Integer> getFactorial(@PathVariable Integer number) {
        return ResponseEntity.ok(business.getFactorial(number));
    }
}
