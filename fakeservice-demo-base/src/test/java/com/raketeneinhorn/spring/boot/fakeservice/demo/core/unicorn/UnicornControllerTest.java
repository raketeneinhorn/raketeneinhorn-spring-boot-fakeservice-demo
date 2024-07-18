package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnicornControllerTest {

    @Mock
    private UnicornService unicornServiceMock;

    private UnicornController unicornControllerUnderTest;

    @BeforeEach
    void setUp() {
        unicornControllerUnderTest = new UnicornController(unicornServiceMock);
    }

    @Nested
    class readUnicorns {

        @Test
        void callsReadUnicornsOnUnicornService() {
            unicornControllerUnderTest.readUnicorns();

            Mockito.verify(unicornServiceMock, Mockito.times(1)).readUnicorns();
        }

    }

}