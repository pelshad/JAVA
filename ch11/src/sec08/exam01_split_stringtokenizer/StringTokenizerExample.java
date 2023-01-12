package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
//		2. StringTokenizer
//		 1) 구분자 하나를 지정하여 배열에 저장

		
		String text = "홍길동/이수홍/박연수/김자바/최명호";
		StringTokenizer st = new StringTokenizer(text, "/");
		//countTokens() r:int 꺼내지 않고 '남아있는' 토큰수
		int countTokens = st.countTokens();
		System.out.println("토큰수 : " + countTokens);
		//hasMoreTokens() r:bool 남아 있는 토큰 확인
		while(st.hasMoreTokens()) {
			//nextTokens() r:String 토큰을 하나씩 꺼내옴
			System.out.println(st.nextToken());
		}
		//만약 토큰을 다 출력한 후 다시 토큰을 출력하고 싶으면 다시
		//StringTokenizert 객체를 호출해야된다.

	}

}
