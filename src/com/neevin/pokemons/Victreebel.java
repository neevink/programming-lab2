package com.neevin.pokemons;

import com.neevin.moves.DoubleTeamMove;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int level){
        super(name, level);

        double hp = 80,
                attack = 105,
                defense = 65,
                specialAttack = 100,
                specialDefense = 70,
                speed = 70;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        addMove(new DoubleTeamMove());
    }
}
