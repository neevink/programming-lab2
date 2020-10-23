package com.neevin;

import com.neevin.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Miltank("Сиськастый", 1);
        Pokemon p2 = new Pokemon("Ноунейм", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
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