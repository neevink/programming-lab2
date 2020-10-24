package com.neevin;

import com.neevin.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon siskastiy = new Miltank("Сиськастый", 30);
        Pokemon goodBoy = new Snubbull("Хороший мальчик", 15);
        Pokemon dog = new Granbull("Пёс", 26);

        Pokemon flower = new Bellsprout("Цветок", 15);
        Pokemon weed = new Weepinbell("Сорняк", 26);
        Pokemon flycatcher = new Victreebel("Мухоловка", 30);

        battle.addAlly(siskastiy);
        battle.addAlly(goodBoy);
        battle.addAlly(dog);

        battle.addFoe(flower);
        battle.addFoe(weed);
        battle.addFoe(flycatcher);

        battle.go();
    }
}
/*

option:31198

Miltank
    Атаки: Double Team, Double-Edge, Thunder Wave, Ice Beam

Snubbull
    Атаки: Wild Charge, Thunderbolt, Sludge Bomb
Granbull
    Атаки: Wild Charge, Thunderbolt, Sludge Bomb, Stone Edge

Bellsprout
    Атаки: Swagger, Poison Jab
Weepinbell
    Атаки: Swagger, Poison Jab, Acid
Victreebel
    Атаки: Swagger, Poison Jab, Acid, Double Team

 */