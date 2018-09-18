package com.Json.logJson;

import com.Json.logJson.controller.LogController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
public class LogControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private LogController logController;

    @Before
    public void setUp() throws Exception
    {
        mockMvc = MockMvcBuilders.standaloneSetup(logController).build();
    }

    @Test
    public void testLogController() throws Exception
    {
        String q = "check";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/search")
        .param("q",q))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

}
