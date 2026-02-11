package com.github.catvod.spider;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName Sp91Test
 * @Description TODO
 * @Author admin
 * @Date 2026/02/11 10:39
 * @Version 1.0
 **/
class Sp91Test {

    private static Sp91 douban = new Sp91();

    static {
        try {
            douban.init();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void homeContent() throws Exception {
        String s = douban.homeContent(false);
        System.out.println(s);
    }

    @Test
    void categoryContent() {
    }

    @Test
    void detailContent() {
    }

    @Test
    void searchContent() {
    }

    @Test
    void playerContent() {
    }
}