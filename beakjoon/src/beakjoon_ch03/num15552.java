package beakjoon_ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class num15552 {

	public static void main(String[] args) throws IOException {
		// BufferedReader + InputStreamReader :: Scanner 대신 사용
		// BufferedWriter + OutputStreamWriter :: System.out.println 대신 사용
		// IOException :: 위 기능을 사용시 IO예외처리(try & catch문도 활용하긴함)
		// 사용시 main 메소드 옆에 throws IOException을 작성
		// StringTokenizer :: readLine()의 값을 공백단위로 구분하여 순서대로 호출
		// String.split()함수를 활용해 배열에 공백단위로 끊어도됨
		// String array[] = s.split(" ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			
		}
		
		bw.close();
	}
}
