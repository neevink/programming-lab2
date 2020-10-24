package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeamMove extends StatusMove {
    public DoubleTeamMove(){
        // Move type, power, accuracy
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует способность \"Двойная команда\"";
    }

    @Override
    protected void applySelfEffects(Pokemon attacking) {
        // Увеличивает уклончивость атакующего покемона на один пункт
        attacking.setMod(Stat.EVASION, 1);
    }
}
