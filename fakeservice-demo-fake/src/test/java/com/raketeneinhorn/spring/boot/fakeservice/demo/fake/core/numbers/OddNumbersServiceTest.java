package com.raketeneinhorn.spring.boot.fakeservice.demo.fake.core.numbers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddNumbersServiceTest {

    private final OddNumbersService oddNumbersServiceUnderTest = new OddNumbersService();

    @Nested
    class GenerateNumbers {

        @Test
        void onlyGeneratesOddNumbers() {
            assertThat(oddNumbersServiceUnderTest.generateNumbers())
                .filteredOn(i -> (i & 1) == 0)
                .isEmpty();
        }

    }

}