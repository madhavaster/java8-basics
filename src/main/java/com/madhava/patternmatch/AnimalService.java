package com.madhava.patternmatch;

public class AnimalService {

    public String retriveName(Animal animal) {
        return switch (animal) {
            case Cat(var name, _) when name == null -> "";
            case Cat(var name, _) -> name;
            case Dog(var name, _) -> name;
            case null -> "";
        };
    }
}