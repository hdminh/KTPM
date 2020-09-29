package com.ktpm.week1.unit;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Unit {
    protected int price;
    protected int attack;

    public abstract Unit cloneUnit();
}
