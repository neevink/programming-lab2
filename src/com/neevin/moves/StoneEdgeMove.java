package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

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
    protected void applySelfEffects(Pokemon attacking){
        // Для этого хода скорость удара увечичивается на 4 ступени
        Effect effect = new Effect().chance(1).turns(0).stat(Stat.SPEED, 4);
        attacking.addEffect(effect);
    }
}
