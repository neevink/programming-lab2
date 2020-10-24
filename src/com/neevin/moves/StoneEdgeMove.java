// All done
package com.neevin.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class StoneEdgeMove extends PhysicalMove {
    public StoneEdgeMove(){
        // Type, power, accuracy
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected String describe() {
        return "кадет камень в противника";
    }

    @Override
    protected double calcCriticalHit(Pokemon attacking, Pokemon attacked) {
        // Вероятность нанести критический удар в 3 раза выше, чем обычно
        if (attacking.getStat(Stat.SPEED) * 3 / 512.0D > Math.random()) {
            System.out.println("Критический удар!3!");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
}
