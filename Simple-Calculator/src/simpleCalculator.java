
public class simpleCalculator {
	private double num1;
	private double num2;
	public void setNum1(double num){
		this.num1=num;
	}
	public void setNum2(double num) {
		this.num2=num;
	}
	public double add() {
		return num1+num2;
	}
	public double subtract() {
		return num1-num2;
	}
	public double divide()throws IllegalArgumentException {
		if (num2==0) {
			throw new IllegalArgumentException();
		}
		return num1/num2;
	}
	public double multiply() {
		return num1*num2;
	}
	
}
