package sec04.exam03_objects_hash;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		
	}
	
	static class Student{
		int sno;
		String name;
		
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			//return sno or name.hashCode();
			//이렇게 작성하면 둘중에 하나만 같아도 동등객체로 인식함
			return Objects.hash(sno, name);
			//int값은 hash()메소드 안에서 integer로 변환됨(객체화)
			//sno, name의 값을 이용하여 hashCode를 생성
			
		}
		
		//확실한 동등비교를 위해 equals를 재정의
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno == this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
