package com.accolite.test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestApp  extends TestCase
{

public TestApp( String testName )
{
    super( testName );
}

public static Test suite()
{
    return new TestSuite( TestApp.class );
}

public void testApp()
{
    assertTrue( true );
}
}