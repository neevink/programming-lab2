package com.neevin.pokemons;

import ru.ifmo.se.pokemon.*;
import com.neevin.moves.*;

public class Snubbull extends Pokemon {
    public Snubbull(String name, int level){
        super(name, level);

        double hp = 60,
                attack = 80,
                defense = 50,
                specialAttack = 40,
                specialDefense = 40,
                speed = 30;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        //Snubbull max level = 22
        setLevel(level <= 22 ? level : 22);

        setType(Type.FAIRY);

        setMove(new WildChargeMove(), new ThunderboltMove(), new SludgeBombMove());
    }
}
