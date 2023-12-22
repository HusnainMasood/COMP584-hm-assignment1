package com.comp584.task;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskApplicationTests {

	@Autowired
	private TaskController tController;

	@Test
	void contextLoads() throws Exception {
		assertThat(tController).isNotNull();
	}

}
