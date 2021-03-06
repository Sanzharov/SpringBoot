package com.Json.logJson;

import com.Json.logJson.controller.LogController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LogJsonApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private LogController logController;
	@Test
	public void contexLoads() throws Exception {
		assertThat(logController).isNotNull();
	}
}

