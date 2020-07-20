package com.gvn.exceptionlogging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class TestOne extends TestCase{

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestOne( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return (Test) new TestSuite( TestOne.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
