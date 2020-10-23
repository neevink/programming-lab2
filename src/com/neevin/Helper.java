package com.neevin;

public class Helper {
    // Получить результат вероятности
    public static boolean getChance(int percent){
        if( Math.random() <= percent/100. ){
            return true;
        }
        else{
            return  false;
        }
    }
}
