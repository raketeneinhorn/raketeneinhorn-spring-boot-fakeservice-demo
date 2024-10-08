package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NiceUnicornServiceTest {

    private final NiceUnicornService niceUnicornServiceUnderTest = new NiceUnicornService();

    @Nested
    class ReadUnicorns {

        @Test
        void containsBluetensternLichtblueteAmong10() {
            assertThat(niceUnicornServiceUnderTest.readUnicorns())
                .hasSize(10)
                .contains("Blütenstern Lichtblüte");
        }

    }

}