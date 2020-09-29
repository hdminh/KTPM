package com.ktpm.week1.barrack;

import com.ktpm.week1.exception.NoUnitNameException;
import com.ktpm.week1.unit.Pikeman;
import com.ktpm.week1.unit.Swordman;
import com.ktpm.week1.unit.Unit;

import java.util.EnumMap;
import java.util.Map;

public class Barrack {
    private final Map<UnitName, Unit> prototypes = new EnumMap<>(UnitName.class);
    public enum UnitName {
        SWORD_MAN,
        PIKE_MAN
    }

    public Barrack() {
        prototypes.put(UnitName.PIKE_MAN, new Swordman());
        prototypes.put(UnitName.SWORD_MAN, new Pikeman());
    }

    public Unit newUnit(UnitName unitName){
        if (prototypes.containsKey(unitName)){
            return prototypes.get(unitName).cloneUnit();
        }
        else {
            throw new NoUnitNameException();
        }
    }
}
