package com.next.poc.cloudspringcontract;

import org.junit.Before;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

/**
 * BaseAccureTest
 */
public class BaseAccureTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new BookRest());
    }
}