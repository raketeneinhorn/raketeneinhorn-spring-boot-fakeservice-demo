package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import jakarta.annotation.Nonnull;

import java.util.List;

public interface NumbersService {

    @Nonnull
    List<Integer> generateNumbers();

}
