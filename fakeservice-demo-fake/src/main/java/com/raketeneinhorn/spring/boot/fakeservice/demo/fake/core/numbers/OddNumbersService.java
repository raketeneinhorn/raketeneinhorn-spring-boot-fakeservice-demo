package com.raketeneinhorn.spring.boot.fakeservice.demo.fake.core.numbers;

import com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers.NumbersService;
import jakarta.annotation.Nonnull;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class OddNumbersService implements NumbersService {

    @Nonnull
    @Override
    public List<Integer> generateNumbers() {
        return List.of(1, 3, 5, 7, 9);
    }

}
