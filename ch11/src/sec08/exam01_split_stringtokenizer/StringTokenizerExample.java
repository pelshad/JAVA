package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
//		2. StringTokenizer
//		 1) ������ �ϳ��� �����Ͽ� �迭�� ����

		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���/���ڹ�/�ָ�ȣ";
		StringTokenizer st = new StringTokenizer(text, "/");
		//countTokens() r:int ������ �ʰ� '�����ִ�' ��ū��
		int countTokens = st.countTokens();
		System.out.println("��ū�� : " + countTokens);
		//hasMoreTokens() r:bool ���� �ִ� ��ū Ȯ��
		while(st.hasMoreTokens()) {
			//nextTokens() r:String ��ū�� �ϳ��� ������
			System.out.println(st.nextToken());
		}
		//���� ��ū�� �� ����� �� �ٽ� ��ū�� ����ϰ� ������ �ٽ�
		//StringTokenizert ��ü�� ȣ���ؾߵȴ�.

	}

}
