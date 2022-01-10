package com.automation.tests;

import org.testng.annotations.*;

public class TestNGTest {

    @Test(groups = "@Smoke")
    public void firstTest(){
        System.out.println("Test 1");
    }

    @Test(groups = "@Regression")
    public void secondTest(){
        System.out.println("Test 2");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before");
    }

    @BeforeMethod
    public void cleanUp(){
        System.out.println("After");
    }

    public static void main(String[] args) {


    }


}
