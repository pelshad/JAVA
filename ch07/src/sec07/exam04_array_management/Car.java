package sec07.exam04_array_management;

public class Car {
	Tire[] arr = {
			new Tire("�տ���", 6),
			new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3),
			new Tire("�ڿ�����", 4)
	};

	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		
	}
}
