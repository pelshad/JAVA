package sec08.exam02_return;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setGas(0 );
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("���");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
		
		
	}

}
