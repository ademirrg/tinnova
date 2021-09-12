package br.com.tinnova.test4.business.impl;

import br.com.tinnova.test4.business.MultipleSumBusiness;
import org.springframework.stereotype.Service;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.Objects;

@Service
public class MultipleSumBusinessImpl implements MultipleSumBusiness {

    public Integer getMultipleSum(Integer number) {

        Integer[] multiples = new Integer[number];
        int j = 0;
        for (int i = 1; i <= number; i++) {

            if (verifyMultiple(i % 3)) {
                multiples[j] = i;
                j++;
            } else if (verifyMultiple(i % 5)) {
                multiples[j] = i;
                j++;
            }
        }
        multiples = Arrays.stream(multiples).filter(Objects::nonNull).toArray(Integer[]::new);
        Integer multipleSum = 0;
        for (int i = 0; i < multiples.length; i++) {
            multipleSum = multipleSum + multiples[i];
        }
        return multipleSum;
    }


    public static boolean verifyMultiple(double remainder) {
        if (remainder == 0) {
            return true;
        } else {
            return false;
        }
    }
}
