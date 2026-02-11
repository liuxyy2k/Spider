package com.github.catvod.spider;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName JavDbTest
 * @Description TODO
 * @Author admin
 * @Date 2026/02/11 10:47
 * @Version 1.0
 **/
class JavDbTest {

    private static JavDb douban = new JavDb();

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