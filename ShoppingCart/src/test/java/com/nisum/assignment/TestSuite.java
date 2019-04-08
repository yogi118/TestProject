package com.nisum.assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import net.serenitybdd.jbehave.SerenityStories;

public class TestSuite extends SerenityStories {
	public TestSuite() 
	{
		String testSuitePropertyPath = System.getProperty("user.dir").
                concat("/src/test/resources/propertyfiles/testsuite.properties");
        try {
            byte[] encodedFeatureNames = Files.readAllBytes(Paths.get(testSuitePropertyPath));
            String featuresToRun = new String(encodedFeatureNames, "utf-8");
            this.findStoriesCalled(featuresToRun);
        }
        catch (IOException e) {
        }
	}
}
