package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		//String�� split()
		//����ǥ������ �����ڷ��ؼ� �κ� ���ڿ��� �и��� ��, �迭�� ���� ����
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
	}

}
