package com.neevin.moves;

import com.neevin.Helper;
import ru.ifmo.se.pokemon.*;

public class PoisonJabMove extends PhysicalMove {
    public PoisonJabMove(){
        // Move type, power, accuracy
        super(Type.POISON, 80, 100);
    }

    @Override
    protected String describe(){
        return "испускает ядовитый запах";
    }

    @Override
    protected void applyOppDamage(Pokemon attacked, double damage){
        attacked.setMod(Stat.HP, (int)Math.round(damage));

        // Может отравить атакованного покемона с вероятностью 30%
        if(Helper.getChance(30)){
            Effect.poison(attacked);
        }
    }
}
