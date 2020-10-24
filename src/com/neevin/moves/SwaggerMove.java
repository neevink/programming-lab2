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
        Effect.confuse(pokemon); // ????????
    }
}
