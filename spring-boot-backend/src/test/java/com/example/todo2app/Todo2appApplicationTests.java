package com.example.todo2app;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Todo2appApplicationTests {
	final static Logger logger = Logger.getLogger(Todo2appApplicationTests.class);
	

	@Test
	public void contextLoads() {
		logger.info("Todo2appApplicationTests :: contextLoads ");
	}

}
