package assignment.calculator;

class Substraction extends Maths{
	Substraction(double a,double b){
		super(a,b);
	}

	@Override
	public void perform() {
		result=num1-num2;  
	}
}
