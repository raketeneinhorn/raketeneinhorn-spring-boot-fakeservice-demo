package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import jakarta.annotation.Nonnull;

import java.util.List;

public interface UnicornService {

    @Nonnull
    List<String> readUnicorns();

}
