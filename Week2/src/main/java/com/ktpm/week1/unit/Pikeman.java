package com.ktpm.week1.unit;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Data
public class Pikeman extends Unit{

    public Pikeman() {
        price = 100;
        attack = 50;
    }

    public Unit cloneUnit() {
        log.info("Pike man");
        return new Pikeman();

    }
}
