package com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UnicornController {

    private final UnicornService unicornService;

    @GetMapping("/unicorns")
    public List<String> readUnicorns() {
        return unicornService.readUnicorns();
    }

}
