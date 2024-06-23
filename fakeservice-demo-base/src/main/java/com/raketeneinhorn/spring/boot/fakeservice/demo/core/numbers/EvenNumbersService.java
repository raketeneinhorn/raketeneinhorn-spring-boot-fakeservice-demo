package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import jakarta.annotation.Nonnull;

import java.util.List;

class EvenNumbersService implements NumbersService {

    @Nonnull
    @Override
    public List<Integer> generateNumbers() {
        return List.of(2, 4, 6, 8, 10);
    }

}
