package br.com.tinnova.test2.controller;

import br.com.tinnova.test2.business.BubbleSortBusiness;
import br.com.tinnova.test2.dto.BubbleSortRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/test-2/bubble-sort")
public class BubbleSortController {

    @Autowired @Lazy
    BubbleSortBusiness business;

    @PostMapping
    private ResponseEntity<Integer[]> bubbleSort(@Valid @RequestBody BubbleSortRequestDTO requestDTO) {
        return ResponseEntity.ok(business.getBubbleSort(requestDTO));
    }
}
