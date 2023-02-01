package com.randywzhang.SpringBootTutorial.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest {

    @Autowired
    private MockMvc mockModelViewController;
    private MockHttpServletRequestBuilder requestBuilder;

    private final String HOME_URI = "/";

    private void setup() {
        this.requestBuilder = MockMvcRequestBuilders.get(HOME_URI).accept(MediaType.APPLICATION_JSON);
    }

    @Test
    public void getIndex() throws Exception {
        setup();

        mockModelViewController.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }
}
