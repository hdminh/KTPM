package com.week3.demo;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FlexibleObjectMain {
    public static void main(String[] args) {
        FlexibleObject phanso = new FlexibleObject(ObjectType.PHAN_SO);
        FlexibleObject book = new FlexibleObject(ObjectType.BOOK);

        log.info("Phan so Default Keys: {}", phanso.getAllKey());
        log.info("Phan so Default Value:");

        phanso.getAllKey().forEach(key -> log.info("{}: {}", key, phanso.get(key)));

        if (phanso.set("tuSo", 3) && phanso.set("mauSo", 5)) {
            log.info("Phan so sau khi set:");
            phanso.getAllKey().forEach(key -> log.info("{}: {}", key, phanso.get(key)));
        }
        log.info("Book Default Keys: {}", book.getAllKey());
    }
}
