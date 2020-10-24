package com.neevin.pokemons;

import com.neevin.moves.AcidMove;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level){
        super(name, level);

        double hp = 65,
                attack = 90,
                defense = 50,
                specialAttack = 85,
                specialDefense = 45,
                speed = 55;

        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        //Weepinbell min level 21
        setLevel(level >= 21 ? level : 21);

        addMove(new AcidMove());
    }

}
