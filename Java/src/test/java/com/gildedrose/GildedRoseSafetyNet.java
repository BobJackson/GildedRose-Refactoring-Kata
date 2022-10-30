package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseSafetyNet {

    @Test
    void should_always_align_with_baseline() throws IOException {
        String output = TextTestFixture.getBaseline();
        String baseline = Files.readString(Path.of("src/test/java/baseline.txt"), StandardCharsets.UTF_8);
        assertEquals(output, baseline);
    }
}
