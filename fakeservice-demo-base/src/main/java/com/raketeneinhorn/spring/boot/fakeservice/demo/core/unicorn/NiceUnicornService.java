package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import jakarta.annotation.Nonnull;

import java.util.List;

class NiceUnicornService implements UnicornService {

    @Nonnull
    @Override
    public List<String> readUnicorns() {
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
