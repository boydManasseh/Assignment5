
public class HolidayBonus extends TwoDimRaggedArrayUtility{
	
	public static double[] calculateHolidayBonus(double [][] data, double high, double low, double other) {
		
		double [] bonus = new double[data.length];
		
		//Max in category
		int colCount = 0;
		for(int row = 0; row < data.length;row++) {
			if(colCount < data[row].length) {
				colCount = data[row].length;
			}
		}
		
		for(int col = 0;col < colCount;col++) {
			
			int highIndex = getHighestInColumnIndex(data,col);
			int lowIndex = getLowestInColumnIndex(data,col);
			
			if(getHighestInColumn(data,col)>0) {
				bonus[highIndex] += high;
			}
			
			if(getLowestInColumn(data, col) > 0 && highIndex != lowIndex) {
				bonus[lowIndex] += low;
			}
			
			for(int row = 0; row < data.length;row++) {
				if(col >= data[row].length || row == highIndex || row == lowIndex || data[row][col] <= 0) {
					continue;
				}else {
					bonus[row]+=other;
				}
				System.out.println();
			}
			
		}
		return bonus;
	}
	
	public static double calculateTotalHolidayBonus(double [][] data, double high, double low, double other) {
		double sum = 0;
		double [] bonusTotal = calculateHolidayBonus(data,high,low,other);
		
		for(double b:bonusTotal) {
			sum+=b;
		}
		
		
		return sum;
	}

}
