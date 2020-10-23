package com.neevin.pokemons;

import com.neevin.moves.DoubleEdgeMove;
import com.neevin.moves.DoubleTeamMove;
import com.neevin.moves.IceBeamMove;
import com.neevin.moves.ThunderWaveMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Miltank extends Pokemon {
    public Miltank(String name, int level){
        super(name, level);

        double hp = 95,
                attack = 80,
                defense = 105,
                specialAttack = 40,
                specialDefense = 70,
                speed = 100;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setType(Type.NORMAL);

        setMove(new DoubleTeamMove(), new DoubleEdgeMove(), new ThunderWaveMove(), new IceBeamMove());
    }
}
