package sec05_try_with_resources;

public class FileInputStream implements AutoCloseable{
	//try-with-resources
	//���ܹ߻� ���ο� ������� ����ߴ� ������ ��ü(���� ����½�Ʈ��, ��������, ����, ���� ä��)�� 
	//close() �޼ҵ带 ȣ���ؼ� �����ϰ� ���ҽ��� �ݾ��ش�.
	
	//�������
	//java.lang.autoclosealbe �������̽��� �����ϰ� �־�� �Ѵ�.
	
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
	
}
