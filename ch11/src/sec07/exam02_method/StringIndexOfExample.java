package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		//���ڿ� ã��(indexOf)
		//�Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε����� ����
		//�־��� ���ڿ��� ���ԵǾ� ���� ������ -1�� ����
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٰ� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("�ڹٰ� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
	}

}
