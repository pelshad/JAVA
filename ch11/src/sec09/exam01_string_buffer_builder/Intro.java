package sec09.exam01_string_buffer_builder;

public class Intro {
		/*
			문자열 결합 연산자+
			 String은 내부의 문자열을 수정할 수 없다.
			 내부에 문자열이 수정되는 것이 아닌 새로운 객체를 생성한다.
			 메모리 낭비로 이어짐
		 */
		String value1 = "";
		String value2 = "";
		String value3 = "";
		String data = value1 + value2 + value3;
		//이렇게 되면 총 5개의 객체가 메모리에 생성됨
		//각각의 스트링 객체 3개
		//value1 + value2 객체
		//value1 + value2 + value3 객체(data)

		/*
			StringBuffer, StringBuilder
			-버퍼(buffer:데이터를 임시로 저장하는 메모리)에 문자열을 저장.
			-버퍼 내부에서 추가,수정,삭제 작업을 할 수 있다.
			-멀티 스레드환경:StringBuffer를 사용
			-단일 스레드환경:StringBuilder를 사용
			-사용메소드
			 - append(...)
			 - insert(int offset,)
			 - delete(int start, int end)
			 - deleteCharAt(int index)
			 - replace(int start, int end, String str)
			 - StringBuilder reverse()
			 - setCharAt(int index, char ch)
			
		 */
}
