package com.neevin.moves;

import com.neevin.Helper;
import ru.ifmo.se.pokemon.*;

public class AcidMove extends SpecialMove {
    public AcidMove(){
        // Type, power, accuracy
        super(Type.POISON, 40,100);
    }

    @Override
    protected String describe() {
        return "брызгает кислотой";
    }

    @Override
    protected void applyOppDamage(Pokemon attacked, double damage) {
        attacked.setMod(Stat.HP, (int)Math.round(damage));

        // Может понизить особую защиту атакованного покемона на одну степень с вероятностью 10%
        if(Helper.getChance(10)){
            attacked.setMod(Stat.SPECIAL_DEFENSE, (int)attacked.getStat(Stat.SPECIAL_DEFENSE) - 1);
        }
    }
}
