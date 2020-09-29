package com.ktpm.week1;

import com.ktpm.week1.barrack.Barrack;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        try {
            Barrack barrack = new Barrack();
            barrack.newUnit(Barrack.UnitName.PIKE_MAN);
            barrack.newUnit(Barrack.UnitName.SWORD_MAN);
        } catch (RuntimeException e){
            log.error(e.getMessage());
        }
    }
}
