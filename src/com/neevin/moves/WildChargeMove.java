// ALL DONE
package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class WildChargeMove extends PhysicalMove {
    public WildChargeMove(){
        // Type, power, accuracy
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "совершает дикий рывок";
    }

    @Override
    protected void applySelfDamage(Pokemon attacking, double damage) {
        // Атакующий покемон получает чётверть нанесённого урона
        attacking.setMod(Stat.HP, (int)Math.round(damage / 4));
    }
}
