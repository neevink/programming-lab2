package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove {
    public SwaggerMove(){
        // Move type, power, accuracy
        super(Type.POISON, 0, 85);
    }

    @Override
    protected String describe(){
        return "сбивает с толку";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){

    }
}
