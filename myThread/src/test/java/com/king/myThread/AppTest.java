package com.king.myThread;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(glue={"step"}, features = { "src/test/features" })
public class AppTest {
	
}
