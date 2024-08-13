package com.raketeneinhorn.spring.boot.fakeservice.demo.fake.core.unicorn;

import com.raketeneinhorn.spring.boot.fakeservice.demo.core.unicorn.UnicornService;
import jakarta.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Primary
@Service
public class EvilUnicornService implements UnicornService {

    @Nonnull
    @Override
    public List<String> readUnicorns() {
        log.info("readUnicorns() on EvilUnicornService fearfully started");

        return List.of(
            "Dunkelhorn Schattenklaue",
            "Nachtschatten Finsterglut",
            "Schattenhorn Dunkelwind",
            "Finsterstern Nachtfluch",
            "Düstermähne Schwarzschatten",
            "Schwarzglanz Nachtklinge",
            "Grimmhorn Schattenzorn",
            "Dunkelzauber Finsterhauch",
            "Sturmfrost Eisklaue",
            "Finsterkralle Schattenbann"
        );
    }

}
