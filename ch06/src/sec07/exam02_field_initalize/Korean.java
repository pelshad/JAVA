package sec07.exam02_field_initalize;

public class Korean {
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	public Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	// ��ü�� ����Ʈ ���ִ� �޼ҵ�
	public String toString() {
		return "(nation : " + nation + ")" + "(name : " + name + ")" + "(ssn : " + ssn + ")";
	}
}
