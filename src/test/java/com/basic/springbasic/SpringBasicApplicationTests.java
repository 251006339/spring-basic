package com.basic.springbasic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBasicApplicationTests {

    @Test
    public void contextLoads() {
        new CopyOnWriteArraySet<>();



    }

}
