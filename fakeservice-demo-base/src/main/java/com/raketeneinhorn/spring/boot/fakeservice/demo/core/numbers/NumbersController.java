package com.raketeneinhorn.spring.boot.fakeservice.demo.core.numbers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NumbersController {

    private final NumbersService numbersService;

    @GetMapping("/numbers")
    public List<Integer> generateNumbers() {
        return numbersService.generateNumbers();
    }

}
