package com.neevin.pokemons;

import com.neevin.moves.*;
import ru.ifmo.se.pokemon.*;

public class Miltank extends Pokemon {
    public Miltank(String name, int level){
        super(name, level);
        setType(Type.NORMAL);

        double hp = 95,
                attack = 80,
                defense = 105,
                specialAttack = 40,
                specialDefense = 70,
                speed = 100;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new DoubleTeamMove(), new DoubleEdgeMove(), new ThunderWaveMove(), new IceBeamMove());
    }
}
