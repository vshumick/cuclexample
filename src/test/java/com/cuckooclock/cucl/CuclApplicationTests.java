package com.cuckooclock.cucl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CuclApplicationTests {
    static {
        Locale.setDefault(Locale.US);
    }

    @Test
    public void contextLoads() {
    }

}

