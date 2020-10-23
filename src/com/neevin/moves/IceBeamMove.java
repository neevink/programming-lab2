// ABS DONE
package com.neevin.moves;

import com.neevin.Helper;
import ru.ifmo.se.pokemon.*;

public class IceBeamMove extends SpecialMove {
    public IceBeamMove(){
        // Move type, power, accuracy
        super(Type.ICE, 90, 100);
    }

    @Override
    protected String describe() {
        return "испускает ледяной луч";
    }

    @Override
    protected void applyOppDamage(Pokemon attacked, double damage) {
        attacked.setMod(Stat.HP, (int)Math.round(damage));

        // Может заморозить атакованного покемона с вероятностью 10%
        if(Helper.getChance(10)){
            Effect.freeze(attacked);
        }
    }
}
