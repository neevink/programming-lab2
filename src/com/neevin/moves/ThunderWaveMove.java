package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWaveMove extends StatusMove {
    public ThunderWaveMove(){
        // Move type, power, accuracy
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected String describe() {
        return "вызывает волну грома";
    }

    @Override
    protected void applyOppEffects(Pokemon attacked) {
        // Атакованного покемона парализует
        Effect.paralyze(attacked);
    }
}
