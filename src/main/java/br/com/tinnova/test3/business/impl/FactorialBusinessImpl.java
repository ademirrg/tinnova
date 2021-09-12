package br.com.tinnova.test3.business.impl;

import br.com.tinnova.test3.business.FactorialBusiness;
import org.springframework.stereotype.Service;

@Service
public class FactorialBusinessImpl implements FactorialBusiness {

    public Integer getFactorial(Integer number) {
        int i, factorial = 1;
        for(i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
