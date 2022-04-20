import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility{

	public TwoDimRaggedArrayUtility() {

	}

	public static double getAverage(double[][] data) {
		double sum = 0;
		int counter = 0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				sum += data[row][col];
				counter++;
			}
		}

		return sum / counter;
	}

	public static double getColumnTotal(double[][] data, int col) {

		double colTotal = 0;

		for (int row = 0; row < data.length; row++) {
			
			if (col >= data[row].length) {
				continue;
			}
			
			colTotal += data[row][col];
		}

		return colTotal;
	}

	public static double getHighestInArray(double[][] data) {

		double hValue = -999999;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (hValue > data[row][col]) {
					hValue = data[row][col];
				}
			}
		}

		return hValue;
	}

	public static double getHighestInColumn(double[][] data, int col) {

		double hValue = -99999;

		for (int row = 0; row < data.length; row++) {
			
			if (col >= data[row].length) {
				continue;
			}
			
			if (hValue < data[row][col]) {
				hValue = data[row][col];
			}

		}

		return hValue;
	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		int hIndex = -1;
		double x = -99999;

		for (int row = 0; row < data.length; row++) {
			
			if (col >= data[row].length) {
				continue;
			}
			
			if (x < data[row][col]) {
				hIndex = row;
				x = data[row][col];
			}
		}

		return hIndex;
	}

	public static double getHighestInRow(double[][] data, int row) {
		
		double hValue = -999999;
		
		for (int col = 0; col < data[row].length;col++) {
			if (hValue < data[row][col]) {
				hValue = data[row][col];
			}
		}

		return hValue;
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		
		int hIndex = -1;
		double x = -99999;
		
		for(int col = 0; col < data[row].length;col++) {
			if (x < data[row][col]) {
				hIndex = col;
				x = data[row][col];
			}
		}

		return hIndex;
	}

	public static double getLowestInArray(double[][] data) {
		
		double lValue = 99999;
		
		for (int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				if( lValue > data[row][col]) {
					lValue = data[row][col];
				}
			}
		}

		return lValue;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		
		double lValue = 99999;
		
		for (int row = 0; row < data.length; row++) {
			
			if (col >= data[row].length) {
				continue;
			}
			
			if (lValue > data[row][col]) {
				lValue = data[row][col];
			}
		}

		return lValue;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		
		int lIndex = -1;
		double x = 99999;
		
		for(int row = 0; row < data.length; row++) {
			
			if (col >= data[row].length) {
				continue;
			}
			
			if(x > data[row][col]){
				lIndex = row;
				x = data[row][col];
			}
		}

		return lIndex;
	}

	public static double getLowestInRow(double[][] data, int row) {

		double lValue = 99999;
		
		for (int col = 0; col < data[row].length; col++) {
			if (lValue > data[row][col]) {
				lValue = data[row][col];
			}
		}

		return lValue;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {

		int lIndex = -1;
		double x = 99999;
		
		for(int col = 0; col < data[row].length; col++) {
			if(x > data[row][col]){
				lIndex = col;
				x = data[row][col];
			}
		}

		return lIndex;
	}

	public static double getRowTotal(double[][] data, int row) {
		
		double rowTotal = 0;
		
		for( int col = 0; col < data[row].length;col++){
			rowTotal += data[row][col]; 
		}

		return rowTotal;
	}

	public static double getTotal(double[][] data) {
		double total = 0;
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length;col++) {
				total+=data[row][col];
			}
		}
		

		return total;
	}

	public static double[][] readFile(java.io.File file) throws FileNotFoundException{
		
		Scanner s = new Scanner(file);
		int iRow = 0;
		
		String [][] a = new String[10][];
		
		while(s.hasNextLine()) {
			String [] row = s.nextLine().split(" ");
			a[iRow] = new String[row.length];
			for(int i = 0; i < row.length;i++) {
				a[iRow][i] = row[i];
			}
			iRow++;
		}
		
		double [][] data = new double[iRow][];
		for(int row = 0; row < iRow; row++) {
			data[row] = new double[a[row].length];
			for(int col = 0; col < a[row].length;col++) {
				System.out.print(a[row][col] + " ");
				data[row][col] = Double.parseDouble(a[row][col]);
			}
			System.out.println();
		}
		s.close();
		

		return data;
	}

	public static void writeToFile (double[][] data, java.io.File outputFile) throws FileNotFoundException{
		
		PrintWriter op = new PrintWriter(outputFile);
		StringBuilder sb = new StringBuilder();
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col< data[row].length; col++) {
				sb.append(data[row][col] + " ");
			}
			sb.append("\n");
		}
		op.print(sb.toString());
		op.close();

	}

}
