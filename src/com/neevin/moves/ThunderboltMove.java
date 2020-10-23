// ALL done
package com.neevin.moves;

import com.neevin.Helper;
import ru.ifmo.se.pokemon.*;

public class ThunderboltMove extends SpecialMove {
    public ThunderboltMove(){
        // Type, power, accuracy
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "вызывает удар грома";
    }

    @Override
    protected void applyOppDamage(Pokemon attacked, double damage) {
        attacked.setMod(Stat.HP, (int)Math.round(damage));

        // Может парализовать атакованного покемона с вероятностью 10%
        if(Helper.getChance(10)){
            Effect.paralyze(attacked);
        }
    }
}
