//Abs done
package com.neevin.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleEdgeMove extends PhysicalMove{
    public DoubleEdgeMove(){
        // Move type, power, accuracy
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected String describe() {
        return "совершает удрар двойным лезвием";
    }

    @Override
    protected void applySelfDamage(Pokemon attacking, double damage) {
        //При нанесении атаки, треть урона получает атакующий покемон
        attacking.setMod(Stat.HP, (int)Math.round(damage / 3));
    }
}
