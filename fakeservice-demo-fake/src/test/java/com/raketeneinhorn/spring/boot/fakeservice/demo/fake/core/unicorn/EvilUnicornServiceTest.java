package com.raketeneinhorn.spring.boot.fakeservice.demo.fake.core.unicorn;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvilUnicornServiceTest {

    private final EvilUnicornService evilUnicornServiceUnderTest = new EvilUnicornService();

    @Nested
    class GenerateNumbers {

        @Test
        void onlyGeneratesOddNumbers() {
            assertThat(evilUnicornServiceUnderTest.readUnicorns())
                .hasSize(10)
                .contains("Grimmhorn Schattenzorn");
        }

    }

}