package com.github.catvod.spider;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName Cg51Test
 * @Description TODO
 * @Author admin
 * @Date 2026/02/11 8:32
 * @Version 1.0
 **/
class Cg51Test {

    private static Cg51 douban = new Cg51();

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