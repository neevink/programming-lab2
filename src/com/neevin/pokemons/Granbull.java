package com.neevin.pokemons;

public class Granbull extends Snubbull {
    public Granbull(String name, int level){
        super(name, level);

        double hp = 90,
                attack = 120,
                defense = 75,
                specialAttack = 60,
                specialDefense = 60,
                speed = 45;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        //Granbull min level = 23
        setLevel(level >= 23 ? level : 23);

        //addMove();
    }
}
