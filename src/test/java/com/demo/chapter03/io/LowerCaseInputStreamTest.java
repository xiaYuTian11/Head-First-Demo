package com.demo.chapter03.io;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author TMW
 * @date 2020/8/4 16:19
 */
class LowerCaseInputStreamTest {
    @Test
    public void test() {
        int c;
        try {
            File file = new File(this.getClass().getResource("/chapter03").getPath() + "/test.txt");
            System.out.println(file.getPath());
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}