package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenNumbersServiceTest {

    private final EvenNumbersService evenNumbersServiceUnderTest = new EvenNumbersService();

    @Nested
    class GenerateNumbers {

        @Test
        void onlyGeneratesOddNumbers() {
            assertThat(evenNumbersServiceUnderTest.generateNumbers())
                .filteredOn(i -> (i & 1) != 0)
                .isEmpty();
        }

    }

}