package com.ktpm.week1.unit;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Data
public class Swordman extends Unit{
    public Swordman() {
        price = 200;
        attack = 100;
    }

    public Unit cloneUnit() {
        log.info("Sword man");
        return new Swordman();
    }
}
