package com.neevin.pokemons;

import com.neevin.moves.*;

public class Granbull extends Snubbull {
    public Granbull(String name, int level){
        super(name, level);

        //Granbull min level = 23
        setLevel(level >= 23 ? level : 23);

        double hp = 90,
                attack = 120,
                defense = 75,
                specialAttack = 60,
                specialDefense = 60,
                speed = 45;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        addMove(new StoneEdgeMove());
    }
}
