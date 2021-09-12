package br.com.tinnova.test4.controller;

import br.com.tinnova.test4.business.MultipleSumBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-4/multiple-sum")
public class MultipleSumController {

    @Autowired @Lazy
    MultipleSumBusiness business;

    @GetMapping("{number}")
    private ResponseEntity<Integer> getMultipleSum(@PathVariable Integer number) {
        return ResponseEntity.ok(business.getMultipleSum(number));
    }
}
