package com.neevin;

import com.neevin.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon siskastiy = new Miltank("Сиськастый", 1);
        Pokemon puppy = new Snubbull("Щенок", 1);
        Pokemon dog = new Granbull("Пёс", 23);
        battle.addAlly(siskastiy);
        //battle.addAlly(puppy);
        battle.addFoe(dog);
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