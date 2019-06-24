package accolite.mockitoTesting;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import com.accolite.DOA.DatabaseDoa;
import com.accolite.DOA.NetworkDoa;
import com.accolite.service.StoreService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for mockito sample App.
 */
//@RunWith(MockitoJUnitRunner.class)
@RunWith(Parameterized.class)
public class AppTest 
    extends TestCase
{
   
	
	 @InjectMocks
	    StoreService storeService;
	     
	    @Mock
	    DatabaseDoa databaseMock;
	     
	    @Mock
	    NetworkDoa networkMock;
	    
	   @Parameter(value = 1)
		public String expectedResult;
	   
	   @Parameter(value = 0)
		public String input;
	
//		private DatabaseDoa databaseDoa;
//		
//	    @Before
//	    public void initialize() {
//	    	databaseDoa = new DatabaseDoa();
//	    }
	    
	    public void setIdTest(String input, String expectedResult) {
	        this.input = input;
	        this.expectedResult = expectedResult;
	    }
	     
//	    @Test
//	    public void saveTest() throws IOException
//	    {
//	        boolean saved = storeService.save("AppTest.java");
//	        assertEquals(true, saved);
//	         
//	        verify(databaseMock, times(1)).save("AppTest.java");
//	        File f = null;
//			verify(networkMock, times(1)).save("server", "user","password", "deepa.txt", f );
//	    }
//	    
	    
	    @Parameters
	    public static Collection<Object[]> id() {
	        return Arrays.asList(new Object[][] {
	           { "d2", "d2" },
	           { "d5","d5" },
	           { "d11", "d11" },
	           {  "d6", "d6"},
	           { "d7","d7" }
	        });	
	     }
	    @Test
	    public void testsetId() {	
	       System.out.println("Parameterized id is : " + input);
	       assertEquals(expectedResult, DatabaseDoa.setId(input));
	    }
	    
}
