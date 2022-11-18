package sec04.exam01_overriding;

public class ComputerExam {

	public static void main(String[] args) {
		int r = 10;
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.areaCircle(r));
		
		Computer myCom = new Computer();
		System.out.println(myCom.areaCircle(r));

	}

}
