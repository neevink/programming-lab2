package com.neevin.pokemons;

import com.neevin.moves.*;
import ru.ifmo.se.pokemon.*;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);

        double hp = 50,
                attack = 75,
                defense = 35,
                specialAttack = 70,
                specialDefense = 30,
                speed = 40;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        //Bellsprout max level 20
        setLevel(level <= 20 ? level : 20);

        setType(Type.GRASS, Type.POISON);

        setMove(new SwaggerMove(), new PoisonJabMove());
    }
}
