package sec08.exam01_method_declaration;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		//�迭 ��� 1
		int firMethod = com.sum1(new int[] {10, 20 ,30});
		System.out.println(firMethod);
		
		//�迭 ���2
		int[] arr = {11,22,33};
		int firMethod2 = com.sum1(arr);
		System.out.println(firMethod2);
		
		//...���
		int secMethod = com.sum2(40,50,60);
		System.out.println(secMethod);
		
	}

}
