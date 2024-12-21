package com.madhava.patternmatch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalServiceTest {

    private AnimalService animalService = new AnimalService();

    @ParameterizedTest
    @MethodSource("input")
    void retriveName(Animal animal, String expected) {
        assertEquals(expected, animalService.retriveName(animal));
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new Cat("Kitty", "Black"), "Kitty"),
                Arguments.of(new Dog("Spotty", "White"), "Spotty"),
                Arguments.of(null, ""),
                Arguments.of(new Cat(null, "Brown"), "")
        );
    }

}