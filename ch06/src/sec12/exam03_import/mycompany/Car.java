package sec12.exam03_import.mycompany;

//import sec12.exam03_import.hyundai.* ��Ű���� ��ü Ŭ���� ������
import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hyundai.Engine; // ��Ű���� �ش� Ŭ������ ������
import sec12.exam03_import.kumho.*;



public class Car {
	Engine engine = new Engine();
	//�׳� �ۼ��� ������ ����
	//import �ؾߵ�(������ hyundai�� Engine class�� ���)
	//����Ű ctrl + shift + O
	
	//���� ����Ű�� �ش� Ŭ������ �������°� �ƴ� *�� ������ �ϰ� ���� ���
	/*	1. window > preference>java>codeStyle>organize imports
		2. number of imports needed for .*�� 99�� 1�� ����
		3. ctrl+shift+o�� Ŭ�� */
	
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire tire3 = new Tire();
	// hankook, kumho ��Ű������ Tire Class�� �־� ����� class���� ���� ����
	// �ذ� ���
	// 1. import sec12.exam03_import.kumho.Tire
	// ��, import�� �ٸ� Tire class�� �߰��ϸ� �ȵ�!
	// 2. sec12.exam03_import.kumho.Tire tire3 = 
	// new sec12.exam03_import.kumho.Tire();
	// �߰����� import ������ ��� ��밡��
}
