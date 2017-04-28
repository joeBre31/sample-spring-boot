package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import org.junit.Ignore;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

        @Test
        public final void testMultiply() {
        // TODO
         fail("Not yet implemented");
       }

        @Ignore
        @Test
        public final void testSkip() {
        // TODO
         fail("Not yet implemented");
       }
}
