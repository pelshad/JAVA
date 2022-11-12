package sec12.exam01_package_compile;

public class Application {

	public static void main(String[] args) {
		System.out.println("run application");
		
		//이클립스의 경우
		//저장시 bin폴더에 class파일로 컴파일됨
		//확인방법
		//window -> showview -> Navigator
		
		//cmd에서 컴파일 및 실행법
		//java파일을 c:\temp폴더로 이동
		//해당 폴더로 이동후 javac Application.java(파일명)
		//그럼 컴파일 완료 후 class 파일 생성
		//하지만 package 경로가 없어서 실행이 되지 않음
		//해당 패키지는 sec12.exam01_package_compile
		//temp 폴더 안에 sec12\exam01_package_compile 폴더 생성
		//해당 class파일을 이동
		//cmd에서 해당 폴더로 이동해서 실행시 실패(package 경로 오류)
		//package 경로가 적힐 수 있도록 최상위 package폴더가 있는 곳으로 이동(현재의 경우 temp폴더)
		//temp폴더에서 java sec12.exam01_package_compile.Application
		//실행 완료
		//더 간단하게 컴파일(package 경로까지 전부 포함시켜 컴파일)
		//cmd에서 javac -d . Application.java
		//패키지 경로까지 다 완성되어 컴파일 됨
	}

}
