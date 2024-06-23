package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NumbersControllerTest {

    @Mock
    private NumbersService numbersServiceMock;

    private NumbersController numbersControllerUnderTest;

    @BeforeEach
    void setUp() {
        numbersControllerUnderTest = new NumbersController(numbersServiceMock);
    }

    @Nested
    class GenerateNumbers {

        @Test
        void callsGenerateNumbersOnNumbersService() {
            numbersControllerUnderTest.generateNumbers();

            Mockito.verify(numbersServiceMock, Mockito.times(1)).generateNumbers();
        }

    }

}