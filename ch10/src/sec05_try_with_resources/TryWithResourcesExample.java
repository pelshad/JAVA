package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			//try ������ ������ �ڵ������� close() �޼ҵ� ȣ��
			fis.read();
			
			//���ܸ� ������ �߻���Ŵ
			throw new Exception();
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
		
	}

}