package com.neevin.moves;

import com.neevin.Helper;
import ru.ifmo.se.pokemon.*;

public class SludgeBombMove extends SpecialMove {
    public SludgeBombMove(){
        // Type, power, accuracy
        super(Type.POISON, 90, 100);
    }

    @Override
    protected String describe() {
        return "кидает грязевую бомбу";
    }

    @Override
    protected void applyOppDamage(Pokemon attacked, double damage) {
        attacked.setMod(Stat.HP, (int)Math.round(damage));

        // Может отравить атакованного покемона с вероятностью 30%
        if(Helper.getChance(30)){
            Effect.poison(attacked);
        }
    }
}
