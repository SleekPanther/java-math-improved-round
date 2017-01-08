public class MathImprovedRound {
	
	public static double round(double numberToRound, int howManyDecimals){
		double powerOfTen= Math.pow(10, howManyDecimals);		//must be a double to avoid integer division truncation errors
		return Math.round(numberToRound * powerOfTen ) /powerOfTen;
	}
	
	public static void main(String[] args) {
		double numberTest=1.5345;
		System.out.println(MathImprovedRound.round(numberTest, 10));
	}
}