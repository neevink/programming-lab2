package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove {
    public SwaggerMove(){
        // Move type, power, accuracy
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "раскручивается и бьёт противника";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        //Сбивает цель с толку и увеличивает ее атаку на два уровня.
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);
    }
}
