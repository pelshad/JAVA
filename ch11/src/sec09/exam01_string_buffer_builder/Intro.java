package sec09.exam01_string_buffer_builder;

public class Intro {
		/*
			���ڿ� ���� ������+
			 String�� ������ ���ڿ��� ������ �� ����.
			 ���ο� ���ڿ��� �����Ǵ� ���� �ƴ� ���ο� ��ü�� �����Ѵ�.
			 �޸� ����� �̾���
		 */
		String value1 = "";
		String value2 = "";
		String value3 = "";
		String data = value1 + value2 + value3;
		//�̷��� �Ǹ� �� 5���� ��ü�� �޸𸮿� ������
		//������ ��Ʈ�� ��ü 3��
		//value1 + value2 ��ü
		//value1 + value2 + value3 ��ü(data)

		/*
			StringBuffer, StringBuilder
			-����(buffer:�����͸� �ӽ÷� �����ϴ� �޸�)�� ���ڿ��� ����.
			-���� ���ο��� �߰�,����,���� �۾��� �� �� �ִ�.
			-��Ƽ ������ȯ��:StringBuffer�� ���
			-���� ������ȯ��:StringBuilder�� ���
			-���޼ҵ�
			 - append(...)
			 - insert(int offset,)
			 - delete(int start, int end)
			 - deleteCharAt(int index)
			 - replace(int start, int end, String str)
			 - StringBuilder reverse()
			 - setCharAt(int index, char ch)
			
		 */
}
