package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import jakarta.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
class NiceUnicornService implements UnicornService {

    @Nonnull
    @Override
    public List<String> readUnicorns() {
        log.info("readUnicorns() on NiceUnicornService happily started");

        return List.of(
            "Sternenlicht Glanzfeder",
            "Glitzerglanz Sternenzauber",
            "Mondstrahl Silberlicht",
            "Lichtfeder Himmelsglanz",
            "Sonnenfunke Morgenstrahl",
            "Wolkenzauber Himmelsfrost",
            "Blütenstern Lichtblüte",
            "Himmelsschein Wolkenfeder",
            "Regenbogenglanz Sternenregen",
            "Zauberlicht Morgenhauch"
        );
    }

}
