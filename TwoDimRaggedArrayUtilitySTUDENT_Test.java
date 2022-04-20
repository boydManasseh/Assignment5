

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	  private double[][] dataSet1 = {{1.2, 2.3, 3.4, 4.5}, {5.6, 6.7, 7.8}, {8.8, 9.9}};
	  private double[][] dataSet2 = {{-1, 2, -3, 4}, {-5}, {6, -7, 8}, {-9, 10, -11, 12}};
	  private double[][] dataSet3 = {{-15.2, -33.4, -9.5, -71.3}, {-9.4, -21.1}, {-18.5, -11.6, -23.5}, {-17.6, -26.9, -27.7, -32.1}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSet1=dataSet2=dataSet3 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
	    assertEquals(50.2,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	    assertEquals(6.0,TwoDimRaggedArrayUtility.getTotal(dataSet2),.001);
	    assertEquals(-317.8,TwoDimRaggedArrayUtility.getTotal(dataSet3),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
	    assertEquals(5.57,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	    assertEquals(0.5,TwoDimRaggedArrayUtility.getAverage(dataSet2),.001);
	    assertEquals(-24.446,TwoDimRaggedArrayUtility.getAverage(dataSet3),.001);	
	}


}
