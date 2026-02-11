package com.github.catvod.spider;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName XVideosTest
 * @Description TODO
 * @Author admin
 * @Date 2026/02/11 11:04
 * @Version 1.0
 **/
class XVideosTest {

    private static XVideos douban = new XVideos();

    static {
        try {
            douban.init();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void parseHtml() throws Exception {
        String s = douban.homeContent(false);
        System.out.println(s);
    }

    @Test
    void homeContent() {
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