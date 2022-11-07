package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("남은 gas 잔량" + gas);
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run(" + gas + ")" );
				gas--;
			} else {
				System.out.println("break");
				return;
			}
		}
	}
}
